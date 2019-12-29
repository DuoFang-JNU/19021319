function validateindex() 
	{
		var uName = document.box.username.value;
		var pswd = document.box.password.value;	
		if (uName == "") {
			alert("请输入用户名！");
			return false;
		}	 		
		if (pswd == "") {
			alert("请输入密码！");
			return false;
		}
		return true;			
	}
function check_register()
	{
		var dpm=document.box.department.value;
		var uName=document.box.username.value;
		var pswd=document.box.password.value;
		var rpswd=document.box.re_password.value;
		if(dpm==""){
			alert("请输入所属部门！");
			return false;
		}
		if(uName==""){
			alert("请输入用户名！");
			return false;
		}
		if(pswd==""||rpswd==""){
			alert("密码和确认密码不一致！");
			return false;
		}
		return true;
	}
