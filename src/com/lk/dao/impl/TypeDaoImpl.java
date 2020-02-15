package com.lk.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.lk.dao.TypeDao;
import com.lk.model.Type;
@Component("typeDao")
public class TypeDaoImpl implements TypeDao{
	
	private HibernateTemplate hibernateTemplate;
	
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Resource(name="hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void save(Type stu) {
		hibernateTemplate.save(stu);
	}
	public List<Type> selectType() {
		
		return (List<Type>)this.hibernateTemplate.find("from Type s order by s.id asc ");
	}
	public void delete(int id) {
		
		List<Type> s = (List<Type>) hibernateTemplate.find("from Type s where s.id = '"+id+"' ");
		hibernateTemplate.deleteAll(s);
	
	}
	
	
	@Override
	public Type selectTypeSid(int sid) {
		
		return (Type)hibernateTemplate.get(Type.class, sid);
	}
	
	


	
}
