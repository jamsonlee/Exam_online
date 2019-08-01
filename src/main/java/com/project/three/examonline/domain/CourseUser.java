package com.project.three.examonline.domain;

public class CourseUser {
	private Integer courseId;
	private Integer userId;
	//courseId:课程id
	//userId:使用者的id，可以是老师，学生



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
