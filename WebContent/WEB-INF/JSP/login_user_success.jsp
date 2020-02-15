<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
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
		<ul><li><a href="">首页</a></li>
			<li><a href="userData!list" style="color:#ffffff;">用户信息库</a></li>
			<li><a href="">日志库</a></li>
			<li><a href="">密钥管理</a></li>
		</ul>
	</div>
		<div class="welcom">
	        
	        <center>   <h2>操作成功</h2> <br>
	        <a class="button1" href="userData!list" >返回 </a>
	          </center>
	        	
       </div>
    <script language="javascript">
		number();
		function number()
		{
			document.getElementById("page_num").innerHTML=document.getElementById("table").rows.length-1;
		}
		setInterval("number()",100);
	</script>
  </body>
</html>
			