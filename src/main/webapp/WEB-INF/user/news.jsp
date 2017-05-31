<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>社区新闻</title>
<link rel="stylesheet" href="Css/news.css">
<script type="text/javascript" src="js/jquery.1.11.3.min.js"></script>
<script type="text/javascript" src="js/news.js"></script>
</head>
<body>
	<div id="title">
		<form action="goNews">
			<label>新闻关键字:</label>
			<input type="text" name="keyWord" placeholder="搜索" value=""/>
			<input type="submit" value="搜索"/>
		</form>
	</div>
	<div id="guide">
		<font color="red">${errorMessage }</font>
		<ul>
			<c:forEach items="${allNewsType}" var="type">
				<li><a href="javascript:void(0);">${type.typeName }</a></li>
			</c:forEach>
		</ul>
		<a href="javascript:void(0);" id="test" data="57">test</a>
	</div>
	<div id="contentBox">
		<div id="border"></div>
		<div id="newsWindow">
			<ul>
				<c:forEach items="${News }" var="news">
					<li><a href="">${news.newsTitle }</a><fmt:formatDate value="${news.newsDate }" type="both"/></li>
				</c:forEach>
			</ul>
		</div>
		<div id="pages">
			<ul>
				<li><a>首页</a></li>
				<li><a>上一页</a></li>
				<li><a>下一页</a></li>
				<li><a>尾页</a></li>
			</ul>
			<label>跳转至：</label>
			<select>
				<c:forEach var="page" begin="1" end="${pageBean.totalPage }">
					<option>${page }</option>
				</c:forEach>
			</select>
		</div>
	</div>
</body>
</html>