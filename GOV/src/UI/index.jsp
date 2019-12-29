<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>政府管理系统</title>
    
	<meta http-equiv="description" content="政府管理系统---管理员登录">
	
	<link rel="stylesheet" type="text/css" href="css/log_in.css">
	<script language="javascript" src="js/mune.js"></script>
  </head>
  
  <body>
      <div id="div1">
        <div class="logo">
        	政府管理系统
        </div>
        <div class="form1">
            <form action ="check.jsp" method="post" name="box">
                <div class="column">
                    <span>用户名：</span>
                    <input class="decoration" name="username" value="" autocomplete="off" onfocus="if(this.value == '') this.value =''"/>
                </div>
                <div class="column">
                    <span>密&nbsp;&nbsp;&nbsp;码：</span>
                    <input class="decoration" name="password" type="password" value="" onfocus="if(this.value == '') this.value =''"/>
                </div>
                <input id="button" type="submit" value="登录" onclick="return validateindex();"/>
                <a class="register" href="register.jsp">注册</a>
            </form>
        </div>
    </div>
  </body>
</html>