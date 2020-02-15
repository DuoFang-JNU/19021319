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
		<div class="title">用户信息库增加</div>
		<div class="container">
		<div style="height:10px">&nbsp;</div>
		<div >&nbsp;</div>	
		<form action="userData!add" method="post">
			<table id="table" style="width:600px;">
			<tr>
			<td>用户</td>
			<td align="left"><input type="text" name="st.name" ></td>
			</tr>
			<tr>
			<td>身份证号</td>
			<td align="left"><input type="text" name="st.ID_num" ></td>
			</tr>
			<tr>
			<td>数据类型</td>
			<td align="left">
			              <select name="st.type_id">
			             <s:iterator value="types" status="index" id="type">
    		              <option value="<s:property value="#type.id" />"><s:property value="#type.description" /> </option> 
    	                  </s:iterator>
			            </select>
			</td>
			</tr>
			<tr>
			<td>上传部门</td>
			<td align="left">
			             <select name="st.dpment_id">
			             <s:iterator value="departments" status="index" id="dep">
    		              <option value="<s:property value="#dep.id" />"><s:property value="#dep.dpment_id" /></option> 
    	                  </s:iterator>
			            </select>
			</td>
			</tr>
			<tr>
			<td>数据值</td>
			<td align="left"><input type="text" name="st.value" ></td>
			</tr>
			<tr>
			<td colspan="2"><button class="button1">增加</button></td>
			</tr>
			</table>
		</form>	
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
			