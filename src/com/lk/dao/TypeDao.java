package com.lk.dao;

import java.util.List;

import com.lk.model.Type;

public interface TypeDao {
	public void save(Type stu);
	public List<Type> selectType();
	public void delete(int sid);
	
	public Type selectTypeSid(int sid);
	
}
