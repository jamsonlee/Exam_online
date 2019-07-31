package com.project.three.examonline.domain;

import java.sql.Time;

/**
 * 表示一场考试
 */
public class Exam {
	private Integer id;
	private Time time;
	private Integer courseId;
	private Integer paperId;
	/**
	 * id:数据库id;
	 * time:时间限制;
	 * course:课程;
	 * paper:试卷
	 */
	
	//constructors
	public Exam() {
		super();
	}
	public Exam(Integer id, Time time, Integer course, Integer paper) {
		super();
		this.id = id;

		this.time = time;
		this.courseId = course;
		this.paperId = paper;
	}
	
	//methods
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Integer getCourse() {
		return courseId;
	}
	public void setCourse(Integer course) {
		this.courseId = course;
	}
	public Integer getPaper() {
		return paperId;
	}
	public void setPaper(Integer paper) {
		this.paperId = paper;
	}
}
