package com.lk.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.lk.dao.DepartmentDao;
import com.lk.model.Department;
import com.lk.service.IDepartmentService;

@Component("iDepartmentService")
public class DepartmentService implements IDepartmentService{
	private DepartmentDao departmentDao;
	
	public DepartmentService() {
	}
	
	public DepartmentService(DepartmentDao departmentDao) {
		this.departmentDao=departmentDao;
	}
	
	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao=departmentDao;
	}
	
	public void addDepartment(Department department) {
		if(department==null)
			return;
		if(department.getId()!=0)
			return;
		String dpment_id=department.getDpment_id();
		List<Department> departments=departmentDao.getDepartmentByDpmentId(dpment_id);
		if(departments.size()<=0) {
			departmentDao.addDepartment(department);
		}else {
			throw new RuntimeException("���û����Ѵ��ڣ�������û�����");
		}
	}
	
	public Department getDepartmentByID(int id) {
		if(id==0)
			return null;
		return departmentDao.getDepartmentByID(id);
	}
	
	public void deleteDepartment(Department department) {
		if(department==null) 
			return;
		if(department.getId()==0)
			return;
		departmentDao.deleteDepartment(department);
	}
	
	public List<Department> getAllDepartment(){
		return departmentDao.getAllDepartment();
	}
	
	public void updateDepartment(Department department) {
		if(department==null)
			return;
		if(department.getId()==0)
			return;
		departmentDao.updateDepartment(department);
	}
	public boolean validateDepartment(String dpment_id,String passwords) {
		List<Department> departments=departmentDao.getDepartmentByDpmentId(dpment_id);
		if(departments!=null && departments.size()!=0) {
			if(departments.get(0).getPasswords().equals(passwords)) {
				return true;
			}
		}
		return false;
	}
	
	public Integer getIdByDpmentId(String dpment_id) {
		List<Department> departments=departmentDao.getDepartmentByDpmentId(dpment_id);
		return departments.get(0).getId();
	}
}