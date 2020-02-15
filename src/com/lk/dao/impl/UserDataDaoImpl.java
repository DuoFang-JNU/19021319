package com.lk.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.lk.dao.UserDataDao;
import com.lk.model.UserData;
@Component("userDataDao")
public class UserDataDaoImpl implements UserDataDao{
	
	private HibernateTemplate hibernateTemplate;
	
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Resource(name="hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void save(UserData stu) {
		hibernateTemplate.save(stu);
	}
	public List<UserData> selectUserData() {
		
		return (List<UserData>)this.hibernateTemplate.find("from UserData s order by s.id asc ");
	}
	public void delete(int id) {
		
		List<UserData> s = (List<UserData>) hibernateTemplate.find("from UserData s where s.id = '"+id+"' ");
		hibernateTemplate.deleteAll(s);
	
	}
	
	@Override
	public UserData selectUserDataSid(int sid) {
		
		return (UserData)hibernateTemplate.get(UserData.class, sid);
	}

}
