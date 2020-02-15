<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>政府管理系统</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="CSS/manager.css">
  </head>
  
  <body>
  <div id="navigation">
		<div style="margin-left: 60px;">
			<img class="imgic" src="Image/manager.png"/>
		</div>
		<ul><li><a href="home_page.jsp">首页</a></li>
			<li><a href="list.jsp">用户信息库</a></li>
			<li><a href="">日志库</a></li>
			<li><a href="">密钥管理</a></li>
		</ul>
	</div>
	<div class="welcom">
		
		<div id="welcome-login">&nbsp;Wlecome,admin</div>

			<div class="m-div"style="background:#006633"><div class="l-div">今日预警</div>
			<img src="Image/warning.svg" style="width:70px"/><div class="number">10</div></div>
			<div class="m-div"style="background:#339933"><div class="l-div">今日上传</div>
			<img src="Image/storage.svg" style="width:70px"/><div class="number">55</div></div>
			<div class="m-div"style="background:#669933"><div class="l-div">今日请求</div>
			<img src="Image/swap.svg" style="width:70px"/><div class="number">100</div></div>
			<div class="m-div"style="background:#99CC99"><div class="l-div">今日访问</div>
		    <img src="Image/face.svg" style="width:70px"/><div class="number">6</div></div>
		<div id="board">
             <div id="board-title">&nbsp;异常信息</div>
             <table>
			
			</table>
             
		</div>
	</div>
  </body>