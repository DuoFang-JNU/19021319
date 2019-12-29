<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Check Manager</title>
    
	<meta http-equiv="description" content="Check Manager---验证管理员账号密码是否与数据库中匹配">
</head>
  
  <body>
  
<%
     String username=new String(request.getParameter("username").getBytes("ISO-8859-1"),"utf-8");
	 String password=new String(request.getParameter("password").getBytes("ISO-8859-1"),"utf-8");
	 String driverName="com.mysql.jdbc.Driver";
	 String userName="root";
	 String psw="0513&1028root"; //MySQL的密码
	 String dbName="db_goverment";	 
     String url="jdbc:mysql://localhost:3306/db_goverment";
	 Class.forName("com.mysql.jdbc.Driver");	 
	 Connection conn=DriverManager.getConnection(url,userName,psw); ;
		
	 String sql="select * from tb_manager where username='"+username+"' and password='"+password+"'";
	 Statement stmt=conn.createStatement();
	 ResultSet rs=stmt.executeQuery(sql);
	 if(rs.next())
	 {		 
		 response.sendRedirect("login.jsp");			
	 }
	 else
	 {	   
	     out.print("<script language='javascript'>alert('用户名或密码错误,登录失败！');window.location.href='index.jsp';</script>");			 			 			 
	 }
%>    
  </body>
</html>