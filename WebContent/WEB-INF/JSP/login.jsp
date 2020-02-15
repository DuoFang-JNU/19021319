<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>政府管理系统</title>
	
	<link rel="stylesheet" type="text/css" href="CSS/login.css">

  </head>
  <body>
      <div id="div1">
        <div class="logo">
            	政府管理系统
        </div>
        <div class="form1">
             <s:form class="form1" action ="login" validate="true">
                <table align="center" border="0" cellpadding="0" cellspacing="7" width="300">
                	<tr>
                		<td class="text" width="100">用户名:</td>
                		<td><s:textfield name="dpment_id" class="input" size="20" /></td>
                	</tr>
                	<tr>
                		<td class="text">密码:</td>
                		<td><s:password name="passwords" class="input" size="20" /></td>
                	</tr>
                	<tr>
                		<td align="right" height="40" width="125">
                			<a class="register" href="">注册</a>
                		</td>
                		<td align="left" height="40" width="125">
                			<s:submit value="登录" id="button"/>
                		</td>
                	</tr>
                </table>
            </s:form>
        </div>
    </div>
  </body>
</html>