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
</head>
<body>
	<div id="title">
		<form action="">
			<label>新闻关键字:</label>
			<input type="text" name="keyWord" placeholder="搜索"/>
			<input type="submit" value="搜索"/>
		</form>
	</div>
	<div id="guide">
		<font color="red">${errorMessage }</font>
		<ul>
			<c:forEach items="${allNewsType}" var="type">
				<li><a href="#">${type.typeName }</a></li>
			</c:forEach>
		</ul>
	</div>
	<div id="body">
		<div id="border"></div>
		<div id="newsWindow">
			<ul>
				<c:forEach items="${allNews }" var="news">
					<li><a href="">${news.newsTitle }</a><fmt:formatDate value="${news.newsDate }" type="both"/></li>
				</c:forEach>
			</ul>
		</div>
	</div>
</body>
</html>