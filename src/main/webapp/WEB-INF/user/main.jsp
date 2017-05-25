<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>联和社区首页</title>
<link rel="stylesheet" href="css/main.css">
</head>
<body>
<div id="menuBar"><%@ include file="common.jsp"%></div>
${errorMsg}
<div id="basicDiv">
<div id="activity">
	<div id="commActivity">
		<h3>社 区 活 动</h3>
		<div class="actContent">
		<a href="#">
		<img class="actImg" alt="篮球活动" src="images/basketball.png">
		<span class="actName">篮球活动</span>
		</a>
		</div>
	</div>
	
	<div id="travel">
		<h3>结 伴 出 行</h3>
		<div class="actContent">
		<a href="#">
		<img class="actImg" alt="青城山" src="images/travel.png">
		<span class="actName">一起去爬青城山</span>
		</a>
		</div>
	</div>
	
</div>
<div id="communityInfo">
	<div id="news">
		<a href="#">
		<img class="newsImg" alt="" src="images/news.png">
		<span class="actName">军事新闻</span>
		</a>
	</div>
	
	<div id="rent">
		<a href="#">
		<img class="rentImg" alt="" src="images/rent.png">
		<span class="actName">套三价格优惠</span>
		</a>
	</div>
	</div>
<div id="shopping">
	<div>
		<h4>社 区 商 店</h4>
			<ol>
			<li><a href="#">惠民杂货店</a></li>
			<li><a href="#">杂货店2</a></li>
			<li><a href="#">杂货店3</a></li>
			</ol>
		</div>
	<div>
		<h4>积 分 商 城</h4>
		<ol>
			<li><a href="#">积 分 商 城1</a></li>
			<li><a href="#">积 分 商 城2</a></li>
			<li><a href="#">积 分 商 城3</a></li>
		</ol>
	</div>
	<div>
		<h4>物 品 转 让</h4>
		<ol>
			<li><a href="#">物 品 转 让1</a></li>
			<li><a href="#">物 品 转 让2</a></li>
			<li><a href="#">物 品 转 让3</a></li>
		</ol>
	</div>
	
	<div>
		<h4>物 品 转 租</h4>
		<ol>
			<li><a href="#">物 品 转 租1</a></li>
			<li><a href="#">物 品 转 租2</a></li>
			<li><a href="#">物 品 转 租3</a></li>
		</ol>
	</div>
</div>
<div id="unionLife">
	<div>
		<p>帮 帮 我</p>
		<a href="#">谁来帮我换一下灯管</a>
		<a href="#">窗门坏掉</a>
	</div>
	<div>
		<p>失 物 招 领</p>
		<a href="#">钱包招领</a>
		<a href="#">证件招领</a>
	</div>
	<div>
		<p>备用钥匙托管</p>
		<a href="#"><img alt="备用钥匙托管" src="images/key.png" title="我要托管"></a>
	</div>
	<div>
		<p>生活小细节</p>
		<a href="#">我的红烧土豆</a>
		<a href="#">鸡蛋的最佳煮熟时间</a>
	</div>
	<div>
		<p>论 坛</p>
		<a href="#">吐槽</a>
		<a href="#">欢乐颂</a>
	</div>
</div>
</div>
<div id="notice">
	<p>物 业 公 告</p>
	<a href="#">电费下调</a>
	<a href="#">气费下调</a>
</div>
</body>
</html>