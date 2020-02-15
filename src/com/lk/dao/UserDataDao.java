package com.lk.dao;

import java.util.List;

import com.lk.model.UserData;

public interface UserDataDao {
	public void save(UserData stu);
	public List<UserData> selectUserData();
	public void delete(int sid);
	
	public UserData selectUserDataSid(int sid);
	
}
