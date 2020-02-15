package com.lk.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface BaseDao<T> {
	//增或修改
	void saveOrUpdate(T t);
	//�?
	void save(T t);
	//�?
	void delete(T t);
	//�?
	void delete(Serializable id);
	//�?
	void update(T t);
	//�? 根据id查询
	T	getById(Serializable id);
	//�? 符合条件的�?�记录数
	Integer	getTotalCount(DetachedCriteria dc);
	//�? 查询分页列表数据
	List<T> getPageList(DetachedCriteria dc,Integer start,Integer pageSize);
	
}
