package com.lk.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.lk.dao.DepartmentDao;
import com.lk.dao.TypeDao;
import com.lk.dao.UserDataDao;
import com.lk.model.Department;
import com.lk.model.Type;
import com.lk.model.UserData;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Component("userData")
@Scope("prototype")
public class UserDataAction extends ActionSupport implements ModelDriven{
	
	UserData st = new UserData();
	
	@Resource(name="userDataDao")
	private UserDataDao userDataDao;
	
	@Resource(name="departmentDao")
	private DepartmentDao departmentDao;
	
	@Resource(name="typeDao")
	private TypeDao typeDao;
	
	private List<UserData> userDatas;
	
	private List<Department> departments;
	
	private List<Type> types;
	
     

	public DepartmentDao getDeparmentDao() {
		return departmentDao;
	}

	public void setDeparmentDao(DepartmentDao deparmentDao) {
		this.departmentDao = deparmentDao;
	}

	public TypeDao getTypeDao() {
		return typeDao;
	}

	public void setTypeDao(TypeDao typeDao) {
		this.typeDao = typeDao;
	}


	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> deparments) {
		this.departments = deparments;
	}

	public List<Type> getTypes() {
		return types;
	}

	public void setTypes(List<Type> types) {
		this.types = types;
	}

	public UserData getSt() {
		return st;
	}

	public void setSt(UserData st) {
		this.st = st;
	}

	public UserDataDao getUserDataDao() {
		return userDataDao;
	}

	public void setUserDataDao(UserDataDao userDataDao) {
		this.userDataDao = userDataDao;
	}

	public List<UserData> getUserDatas() {
		return userDatas;
	}

	public void setUserDatas(List<UserData> userDatas) {
		this.userDatas = userDatas;
	}
	
	
	/**
	 * 跳转增加
	 * @return
	 * @throws Exception
	 */
	public String goAdd() throws Exception{
		
		departments=departmentDao.getAllDepartment();
		
		types=typeDao.selectType();
		
		return "goAdd";
	}
	

	/**
	 * 增加信息
	 * @return
	 * @throws Exception
	 */
	public String add() throws Exception{
		UserData u = new UserData();
		u.setId(st.getId());//id
		u.setName(st.getName());//用户名字
		u.setID_num(st.getID_num());//用户身份证
		u.setDpment_id(st.getDpment_id());//上传部门
		u.setType_id(st.getType_id());//上传的数据类型
		u.setValue(st.getValue());//上传的数据值
		userDataDao.save(u);
		return "success";
	}
	
	/**
	 * 查询信息
	 * @return
	 * @throws Exception
	 */
	public String list() throws Exception{
		this.userDatas = this.userDataDao.selectUserData();
		//user_data这个表中dpment_id和type_id使用的是外键
		for(UserData u:userDatas) {
			 Department dep= departmentDao.selectDepartmentSid(u.getDpment_id());
			 u.setDpment_name(dep.getDpment_id());
			 
			 Type type=typeDao.selectTypeSid(u.getType_id());
			 u.setType_name(type.getDescription());
		}
		
		return "list";
	}
	
	/**
	 * 删除信息
	 * @return
	 * @throws Exception
	 */
	public String delete() throws Exception{
		userDataDao.delete(st.getId());
		return "delete";
	}

	
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return st;
	}
	
	
}
