package com.project.three.examonline.domain;

public class User2 {
	//fields
	private Integer id;
	private String identity;
	private String userId;
	private String password;
	private String name;
	public User2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User2(Integer id, String identity, String userId, String password, String name) {
		super();
		this.id = id;
		this.identity = identity;
		this.userId = userId;
		this.password = password;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User2 [id=" + id + ", identity=" + identity + ", userId=" + userId + ", password=" + password
				+ ", name=" + name + "]";
	}
}
