package com.project.three.examonline.domain;

/**
 * 用于表示课程
 */
public class Course {
	//fields
	private Integer id;
	private String name;
	/**
	 * id:数据库id;
	 * name:名称
	 */
	
	
	//constructor
	public Course() {
		super();
	}
	public Course(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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
}
