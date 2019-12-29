<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="db.DBlink"%>
<%@page import="gover.User"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>政府管理系统</title>
    
	<meta http-equiv="description" content="政府管理系统---用户信息库">
	
	<link rel="stylesheet" type="text/css" href="css/manager.css">
	<script src="js/InsertUser.js" language="javascript"></script>
  </head>
  
  <body>
     <div id="navigation">
		<div style="margin-left: 60px;">
			<img class="imgic" src="imgic/manager.png"/>
		</div>
		<ul>
			<li><a href="login.jsp">首页</a></li>
			<li><a href="login_user.jsp" style="color:#ffffff;">用户信息库</a></li>
			<li><a href="">日志库</a></li>
			<li><a href="">密钥管理</a></li>
		</ul>
	</div>
		<div class="welcom">
			<div class="title">用户信息库</div>
			<div id="container">
				<div style="height:10px">&nbsp;</div>
				<div>
					<input class="button1" type="submit" value="增加用户信息" onclick="asking();" />
					<input class="button1" style="margin-right:30px ;float:right;" value="刷新" type="button" onclick="refresh();" /> 
				</div>
				<div >&nbsp;</div>	
				<table id="table">
					<tr>
						<td>User</td>
						<td>Name</td>
						<td>A</td>
						<td>B</td>
					</tr>
					<%
						DBlink db=new DBlink();
						List<User> list=db.readFirst();
						for(User u1:list)
					{%>
					<tr>
						<td><%=u1.getid() %></td>
						<td><%=u1.getname() %></td>
						<td><%=u1.getDataA() %></td>
						<td><%=u1.getDataB() %></td>
					</tr>
					<%
					}%>
				</table>
				<div style="margin-bottom:45px;">
					<div id="page">显示1页10项，共<span id="page_num" style="color:#0BBEAD; padding:0px 5px;"></span>项</div>
					<input class="button2" type="button" style="margin-right:30px ;float:right;"value="下一页"/>
					<input class="button2" type="button" style="color:black; background-color:white; padding:3px" value="&nbsp;1&nbsp;"/>
					<input class="button2" type="button" value="上一页"/>
				</div>
			</div>		
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
			