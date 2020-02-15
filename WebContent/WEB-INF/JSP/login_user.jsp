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
		<div class="title">用户信息库</div>
		<div class="container">
		<div style="height:10px">&nbsp;</div>
		<div><a class="button1" href="userData!goAdd" >增加用户信息 </a>
		<input class="button1" style="margin-right:30px ;float:right;" value="刷新" type="button" onclick="refresh();" /> </div>
		<div >&nbsp;</div>	
			<table id="table">
			<tr>
			<td width="10">序号</td>
			<td>身份证号</td>
			<td>用户名</td>
			<td>数据值</td>
			<td>数据类型</td>
			<td style="width:100px;">上传部门</td>
			<td style="width:100px;">操作</td>
			</tr>
			
			<s:iterator value="userDatas" status="index" id="user">
    		<TR align = "center"> 
    		    <TD><s:property value="#user.id" /></TD> 
    		    <TD><s:property value="#user.ID_num" /></TD>       
				<TD><s:property value="#user.name" /></TD>
				<TD><s:property value="#user.value" /></TD> 
				<TD><s:property value="#user.type_name" /></TD>    	
				<TD><s:property value="#user.dpment_name" /></TD> 
				<TD> <a onclick="if(confirm('确定删除?')==false)return false;" class="button1" href="userData!delete?st.id=<s:property value="#user.id" />" > 删除 </a> </TD> 
				
    		</TR>
    	</s:iterator>
			
			
			</table>
			<div style="height:10px">&nbsp;</div>
			<div id="page">显示1页10项，共<span id="page_num" style="color:#0BBEAD; padding:0px 5px;"></span>项</div>
			<input class="button2" type="button" style="margin-right:30px ;float:right;"value="下一页"/>
			<input class="button2" type="button" style="color:black; background-color:white; padding:3px" value="&nbsp;1&nbsp;"/>
			<input class="button2" type="button" value="上一页"/>
			</div>		
       </div>
    <script language="javascript">
		number();
		function number()
		{
			document.getElementById("page_num").innerHTML=document.getElementById("table").rows.length-1;
		}
		setInterval("number()",100);
		
		function refresh(){
			
			location.reload();
		}
	</script>
  </body>
</html>
			