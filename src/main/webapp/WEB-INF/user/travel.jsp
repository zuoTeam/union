<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>结伴出行</title>
<% String basePath = request.getContextPath(); %>
<link rel="stylesheet" href="<%=basePath %>/Css/travel.css">
<script type="text/javascript" src="<%=basePath %>/js/jquery.1.11.3.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/jquery.validate.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/travel.js"></script>
</head>
<body>
	<%@ include file="common.jsp" %>
	
	<div id="basicDiv">
		<div id="contentDiv">
			<c:choose>
				<c:when test="${null==pageBean}">
				<br/>
				<h2>${travel.travelTitle}</h2><br/>
				<h4>目的地：<span>${travel.travelPlace}</span></h4>
				<h4>出发时间：<fmt:formatDate value="${travel.travelTime}" pattern="yyyy-MM-dd HH:mm:ss"/></h4>
				<br/>
				<div id="inputDiv">
					<input type="hidden" id="userId" value="${user.userId}"><input type="hidden" id="travelId" value="${travel.travelId}">
					${user.userId==travel.user.userId?"":"<input type='button' value='我 要 结 伴' id='toBePartner'/>" }<br/><span id="resultSpan"></span><br/>
					<input type="button" value="我 要 发 布 出 行" id="issueTravel" onclick="javascript:issueTravel(${null!=user?true:false});"/>
				</div>
				<div id="imgDiv">
					<c:forEach items="${travel.images}" var="image">
						<img alt="${travel.travelTitle}" src="<%=application.getContextPath()%>/${image.imagePath}"/><br/><br/>
					</c:forEach>
				</div>
				<p id="contentP">${travel.travelContent}</p>
				
				<div id="initiatorDiv">
				<p>邀约人：<span>${travel.user.userNickname}</span></p>
				<p>邀约人电话：${travel.user.userTel}</p>
				</div>
				<br/><br/><br/>
				<div id="seeOthersTravel">
				<p><a href="gotoTravel?&currentItemCount=${itemChooseBean.previousItem}">${itemChooseBean.currentItemCount-1<0?'<a>没有上一条了</a>':'上一条'}</a>&nbsp;|
				<a href="gotoTravel?&currentItemCount=${itemChooseBean.nextItem}">${itemChooseBean.currentItemCount+1>itemChooseBean.lastItem?'<a>没有下一条了</a>':'下一条'}</a>&nbsp;|
				<a href="toViewAllTravels?currentPage=1">预览全部出行信息</a>
				</p>
				</div>
			</c:when>
			<c:otherwise>
				<br/>
				<h2>结伴出行预览信息</h2>
				<br/>
				<table cellspacing='20px' align='center' >
				<tr><th>出行主题</th><th>出行地点</th><th>出行时间</th><th>要约人</th><th>发布时间</th><th>操作</th></tr>
				<c:forEach items="${pageBean.list}" var="travel" varStatus="status">
					<tr class="${status.count%2==0?'even':'odd'}">
					<td>${travel.travelTitle}</td>
					<td>${travel.travelPlace}</td>
					<td><fmt:formatDate value="${travel.travelTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
					<td>${travel.user.userNickname}</td>
					<td><fmt:formatDate value="${travel.travelPublishTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
					<td>
						<a href="gotoTravel?&currentItemCount=${pageBean.beginIndex+status.index}">查看</a>&nbsp;|
						<a href="javascript:toBePartner(${travel.travelId},${user.userId});" id='toBePartnerA'>结伴</a>
						<%-- <c:forEach items="${attendTravels}" var="at">
							<c:if test="${at.travel.travelId==travel.travelId and at.user.userId==user.userId}">
								<font style="color:red">已结伴</font>
							</c:if>
						</c:forEach> --%>
					</td>
					</tr>
				</c:forEach>
				<tr id="pageTr">
					<td colspan="6">
						<a href='javascript:selectPage(${pageBean.firstPage});'>首页</a>&nbsp;&nbsp;
						<a href='javascript:selectPage(${pageBean.previousPage});'>上一页</a>&nbsp;&nbsp;
						<c:forEach begin="1" end="${pageBean.totalPage}" var="page">
							<a href='javascript:selectPage(${page});'>${page}</a>&nbsp;&nbsp;
						</c:forEach>
						<a href='javascript:selectPage(${pageBean.nextPage});'>下一页</a>&nbsp;&nbsp;
						<a href='javascript:selectPage(${pageBean.lastPage});'>尾页</a>&nbsp;&nbsp;
						第${pageBean.currentPage}页&nbsp;|&nbsp;共${pageBean.totalPage}页
					</td>
				</tr>
				</table>
			</c:otherwise>
			</c:choose>
		</div>
		
		<div id="issueTravelDiv">
			<form action="<%=basePath %>/issueTravel" method="post" enctype="multipart/form-data">
				<fieldset>
					<legend>结 伴 出 行</legend>
		
					<!-- 下面放置注册表单各种标签 -->
				<p>
				<label for="issueTitle" class="slabel">出行主题：</label>
				<input type="text" id="issueTitle" name="issueTitle"/>
				</p>
				<br/>
			<p>
				<label for="issueTravelPlace" class="slabel">出行目的地：</label>
				<input type="text" id="issueTravelPlace" name="issueTravelPlace"/>
			</p>	
			<br/>
			<p>
				<label for="issueTravelTime" class="slabel">出行时间：</label>
				<input type="datetime-local" id="issueTravelTime" name="issueTravelTime"/>
			</p>
			<br/>
			<p>
				<label for="issueImages" class="slabel">旅游地图片介绍：</label>
				<input type="file" id="issueImages" name="issueImages" multiple/>
			</p>
			<br/>
			<p>
				<label for="issueTravelContent" class="slabel">出行内容介绍：</label>
				<textarea id="issueTravelContent" name="issueTravelContent" rows="3" cols="21"></textarea>
			</p>
			<br/>
			<p class="horizonCenter">
				<input type="submit" value="哦 了">
			</p>
			<br/>
			</fieldset>
			</form>
		</div>
	</div>
</body>
</html>