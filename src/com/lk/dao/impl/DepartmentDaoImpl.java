package com.lk.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.lk.dao.DepartmentDao;
import com.lk.model.Department;
@Component("deparmentDao")
public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements DepartmentDao{
	
	
	
	public void addDepartment(Department department) {
		this.getHibernateTemplate().save(department);
	}
	
    public Department getDepartmentByID(int id) {
    	return (Department) this.getHibernateTemplate().get(Department.class,id);
    }
	
	public void deleteDepartment(Department department) {
		this.getHibernateTemplate().delete(department);
	}
	
	public List<Department> getAllDepartment(){
		List<Department> departments=(List<Department>) this.getHibernateTemplate().find("from Department");
		return departments;
	}
	
	public void updateDepartment(Department department) {
		this.getHibernateTemplate().update(department);
	}
	
	public List<Department> getDepartmentByDpmentId(String dpment_id){
		return (List<Department>) this.getHibernateTemplate().find("from Department where dpment_id = '"+dpment_id+"'");
	}
	


	public void save(Department st) {
		this.getHibernateTemplate().save(st);
	}
	public List<Department> selectDepartment() {
		
		return (List<Department>)this.getHibernateTemplate().find("from Department s order by s.id asc ");
	}
	public void delete(int id) {
		
		List<Department> s = (List<Department>) this.getHibernateTemplate().find("from Department s where s.id = '"+id+"' ");
		this.getHibernateTemplate().deleteAll(s);
	
	}
	
	
	@Override
	public Department selectDepartmentSid(int sid) {
		
		return (Department)this.getHibernateTemplate().get(Department.class, sid);
	}
	
	
	
}
