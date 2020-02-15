package com.lk.action;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.lk.service.IDepartmentService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Component("login")
@Scope("prototype")
public class LoginAction extends ActionSupport {
	
	private IDepartmentService departmentService;
	
	private String dpment_id;
	private String passwords;
	
	
	/**
	 * 储存session
	 * @return
	 * @throws Exception
	 */
	public String execute() throws Exception{
		try{
			ActionContext ac = ActionContext.getContext();
			Map<String, Object> session = ac.getSession();
			System.out.println(dpment_id);
			System.out.println(passwords);
			session.put("dpment_id", dpment_id);
			return SUCCESS;
		}catch(Exception e) {
            //将parseDouble方法可能抛出的异常NumberFormatException捕获，
            //然后将捕获的异常重新封装并输出
            throw new Exception("Login Error", e);
		}
	}
	/**
	 * 登录验证用户账号、密码
	 * @return
	 */
	public void validate(){
		try{
			System.out.println(dpment_id);
			System.out.println(passwords);
			if(!departmentService.validateDepartment(dpment_id,passwords)) {
				addFieldError("passwords","密码不正确ȷ");
			}
		}catch(Exception e) {
            try {
				throw new Exception("Login Error!", e);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
	
	public void setDepartmentService(IDepartmentService departmentService) {
		this.departmentService=departmentService;
	}
	public void setDpmentId(String dpment_id) {
		this.dpment_id=dpment_id;
	}
	public void setPasswords(String passwords) {
		this.passwords=passwords;
	}
	public String getDpmentId(String dpment_id) {
		return dpment_id;
	}
	public String getPasswords(String passwords) {
		return passwords;
	}
}