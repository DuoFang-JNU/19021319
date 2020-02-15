package com.lk.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="user_data")
public class UserData {
	private int id;
	private String name;
	private String ID_num;
	private int dpment_id;
	private int type_id;
	private float value;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID_num() {
		return ID_num;
	}
	public void setID_num(String iD_num) {
		ID_num = iD_num;
	}
	public int getDpment_id() {
		return dpment_id;
	}
	public void setDpment_id(int dpment_id) {
		this.dpment_id = dpment_id;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	
	private String dpment_name;
	
	private String type_name;
	
	@Transient
	public String getDpment_name() {
		return dpment_name;
	}
	public void setDpment_name(String dpment_name) {
		this.dpment_name = dpment_name;
	}
	
	@Transient
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
   
}
