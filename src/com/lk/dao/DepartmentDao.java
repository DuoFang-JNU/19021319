package com.lk.dao;

import java.util.List;

import com.lk.model.Department;

public interface DepartmentDao {
	public void save(Department stu);
	public List<Department> getAllDepartment();
	public void delete(int sid);
	
	public Department selectDepartmentSid(int sid);
	
	public void addDepartment(Department department);
	public Department getDepartmentByID(int id);
	public void deleteDepartment(Department department);
	public void updateDepartment(Department department);
	public List<Department> getDepartmentByDpmentId(String dpment_id);

}
