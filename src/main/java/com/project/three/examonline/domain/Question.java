package com.project.three.examonline.domain;

/**
 * 用于表示试题
 */
public class Question {
	//fields
	private Integer id;
	private String type;
	private String purpose;
	private String question;
	private String answer;
	private String picture;
	private Integer points;
	private Integer index;
	private Integer courseId;
	private Integer teacherId;
	/**
	 * id:数据库中的id
	 * type:题目类型,包括单选/多选/主观, single/multiple/subjective
	 * purpose:用途,包括考试/练习 ,  exam/practice
	 * question:题干
	 * answer:答案
	 * picture:图片
	 * points:分数
	 * index:难度系数
	 * course:所属科目(的数据库id)
	 * teacher:创建老师(的数据库id)
	 */
	
	//constructors
	public Question() {
		super();
	}

	public Question(Integer id, String type, String purpose, String question, String answer, String picture,
			Integer points, Integer index, Integer course, Integer teacher) {
		super();
		this.id = id;
		this.type = type;
		this.purpose = purpose;
		this.question = question;
		this.answer = answer;
		this.picture = picture;
		this.points = points;
		this.index = index;
		this.courseId = course;
		this.teacherId = teacher;
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
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Integer getCourse() {
		return courseId;
	}
	public void setCourse(Integer course) {
		this.courseId = course;
	}


	public Integer getPoints() {
		return points;
	}


	public void setPoints(Integer points) {
		this.points = points;
	}


	public Integer getIndex() {
		return index;
	}


	public void setIndex(Integer index) {
		this.index = index;
	}


	public Integer getTeacher() {
		return teacherId;
	}


	public void setTeacher(Integer teacher) {
		this.teacherId = teacher;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	
}
