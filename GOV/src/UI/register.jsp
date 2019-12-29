<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>政府管理系统</title>
    
	<meta http-equiv="description" content="政府管理系统---管理员注册">
	
	<link rel="stylesheet" type="text/css" href="css/register.css">
	<script language="javascript" src="js/mune.js"></script>
  </head>
  
  <body>
  	<div id="total_div">
  		<div class="form_title">
  		管理员注册
  		</div>
  		<form class="form" action="" method="post" name="box">  <!--form标签里的action属性需要修改-->
  			<input name="department" type="text" value="" placeholder="所属单位" autocomplete="off"/>
  			<input name="username" type="text" value="" placeholder="用户名" autocomplete="off"/>
  			<input name="password" type="password" value="" placeholder="密码" />
  			<input name="re_password" type="password" value="" placeholder="确认密码" />
  			<input id="register_OK_button" type="submit" value="注册" onclick="return check_register();"/>
  		</form>
  		<div class="had_register">
  			已有账号，请<a href="index.jsp" class="log_in">登录</a>
  		</div>
  	</div>
  </body>
</html>
