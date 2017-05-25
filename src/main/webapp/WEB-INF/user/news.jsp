<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>社区新闻</title>
<link rel="stylesheet" href="Css/news.css">
</head>
<body>
	<div id="title">
		<label>新闻关键字:</label><input type="text" name="keyWord" placeholder="搜索"/>
	</div>
	<div id="guide">
		<ul></ul>
	</div>
	<div id="body">
		<div id="border"></div>
		<div id="newsWindow"></div>
	</div>
</body>
</html>