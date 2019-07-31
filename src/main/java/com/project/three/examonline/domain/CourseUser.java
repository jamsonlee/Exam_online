package com.project.three.examonline.domain;

public class CourseUser {
	private Integer courseId;
	private Integer userId;
	public CourseUser() {
		super();
	}
	public CourseUser(Integer courseId, Integer userId) {
		super();
		this.courseId = courseId;
		this.userId = userId;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}
