<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="Css/common.css">
<title>通用页面</title>
</head>
<body>
	<div class="common">
		<div class="left">
			<ul>
				<c:choose>
					<c:when  test="${sessionScope.user eq null }">
						<li>
						<a href="#" title="点我登录" class="common_left">登录</a>
						<a href="#" title="点我注册" class="common_left">注册</a>
						<a href="#" title="点我回社区主页" class="common_left">Union主页</a>
						</li>
					</c:when>
					<c:otherwise>
						<li>
							<a href="#" title="点我查看个人信息" class="common_left">欢迎您 ${sessionScope.user.userAccount }</a>
							<a href="#" title="点我回社区主页" class="common_left">Union主页</a>
						</li>
					</c:otherwise>
				</c:choose>
			</ul>
		</div>
		<div class="right">
			<ul>
				<li><a href="#" class="common_right" id="exit">安全退出</a></li>
				<li><a href="#" class="common_right">我的站内信</a></li>
				<li><a href="#" title="查看订单、出游等记录" class="common_right">我的记录</a></li>
			</ul>
		</div>
	</div>
</body>
</html>