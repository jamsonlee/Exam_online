package com.project.three.examonline.domain;

/**
 * 用于表示课程
 */
public class Course {
	//fields
	private Integer id;
	private String type;
	private String name;
	/**
	 * id:数据库id;
	 * type:课程类型;
	 * name:名称
	 */
	
	
	//constructor
	public Course() {
		super();
	}

	public Course(Integer id, String type, String name) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
	}

	//methods
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
