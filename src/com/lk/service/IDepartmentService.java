package com.lk.service;

import java.util.List;
import com.lk.model.Department;

public interface IDepartmentService {
	public void addDepartment(Department department);
	
	public void deleteDepartment(Department department);
	
	public void updateDepartment(Department department);
	
	public Department getDepartmentByID(int id);
	
	public List<Department> getAllDepartment();
	
	public boolean validateDepartment(String dpment_id,String passwords);
	
	public Integer getIdByDpmentId(String dpment_id);
}
