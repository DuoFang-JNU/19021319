function asking() {
	var shade = document.createElement('div');
    shade.id = 'shade';
    shade.style.position = 'fixed';
    shade.style.width = '100%';
	shade.style.height = '100%';
	shade.style.left = 0;
	shade.style.top = 0;
	shade.style.backgroundColor = 'rgba(0,0,0,.5)';
	var input = document.createElement('div');
	input.style.width = '400px';
	input.style.height = '350px';
	input.style.margin = '170px auto auto auto';
	input.style.padding = '16px';
	input.style.background='#fff';
	input.style.borderRadius='4px';
	input.innerHTML = ['<img style="float:right; width:25px; height:24px;" onclick="document.getElementById(\'shade\').remove();" src="imgic/x.png"/>'];
	var context = document.createElement('div');
	context.width='100%';
	context.height='80%';
	context.style.margin = '0px';
	context.style.padding = '0px 16px';
	context.style.fontSize='18px';
	context.innerHTML = [
		'<form action="InsertUser.jsp" method="post" name="register_form" style="margin:10% 20% 1% 20%; text-align:left;">',
		//form标签里的action属性需要修改
		'<div class="message"><input style="height:45px; width:250px; border:0px; border-bottom:1.7px solid #00668D; border-radius:2px; outline:none; margin:0;	padding-left:5px; margin-bottom:10px; font-size:20px;" name="id" type="text" value="" placeholder="ID" autocomplete="off"/></div>',
		'<div class="message"><input style="height:45px; width:250px; border:0px; border-bottom:1.7px solid #00668D; border-radius:2px; outline:none; margin:0;	padding-left:5px; margin-bottom:10px; font-size:20px;" name="name" type="text" value="" placeholder="用户名" autocomplete="off"/></div>',
		'<div class="message"><input style="height:45px; width:250px; border:0px; border-bottom:1.7px solid #00668D; border-radius:2px; outline:none; margin:0;	padding-left:5px; margin-bottom:10px; font-size:20px;" name="dataA" type="text" value="" placeholder="数据A" /></div>',
		'<div class="message"><input style="height:45px; width:250px; border:0px; border-bottom:1.7px solid #00668D; border-radius:2px; outline:none; margin:0;	padding-left:5px; margin-bottom:10px; font-size:20px;" name="dataB" type="text" value="" placeholder="数据B" /></div>',
		'<input style="background:#00668D; border:1px #00668D solid; outline:none; border-radius:5px; margin-top:5%; margin-left:22%; height:40px; width:50%; color:white;" type="submit" value="提交"/>',
		'</form>'].join('');
	input.append(context);
    shade.append(input);
    document.body.append(shade);
}