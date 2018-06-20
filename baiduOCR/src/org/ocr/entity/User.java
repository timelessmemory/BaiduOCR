package org.ocr.entity;

import java.util.Date;

public class User {
	private Integer id;
	private String name;
	private String gender;
	private String nation;
	private String birthday;
	private String address;
	private String code;
	private Date createTime;
	
	public User() {
	}
	
	public User(Integer id, String name, String gender, String nation, String birthday, String address, String code,
			Date createTime) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.nation = nation;
		this.birthday = birthday;
		this.address = address;
		this.code = code;
		this.createTime = createTime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", gender=" + gender + ", nation=" + nation + ", birthday="
				+ birthday + ", address=" + address + ", code=" + code + ", createTime=" + createTime + "]";
	}
}
