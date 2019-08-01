package com.project.three.examonline.domain;

/**
 * 用于表示用户
 */
public class User {
	@Override
	public String toString() {
		return "User [id=" + id + ", identity=" + identity + ", userId=" + userId + ", password=" + password + "]";
	}

	//fields
	private Integer id;
	private String identity;
	private String userId;
	private String password;
	/**
	 * id:在数据库中的id
	 * identity:用户的身份,包括学生/老师/管理员  student/teacher/administrator
	 * userId:用户的学工号
	 * password:用户的密码
	 */
	
	//constructors
	public User() {
		super();
	}
	
	public User(Integer id, String identity, String userId, String password) {
		super();
		this.id = id;
		this.identity = identity;
		this.userId = userId;
		this.password = password;
	}


	//methods
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
}
