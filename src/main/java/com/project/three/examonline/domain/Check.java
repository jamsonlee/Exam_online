package com.project.three.examonline.domain;

/**
 * 学生对成绩进行申诉的数据结构check
 */
public class Check {
	private Integer id;
	private Integer answersheet;
	private String content;
	private String state;
	public Check() {
		super();
	}
	public Check(Integer id, Integer answersheet, String content, String state) {
		super();
		this.id = id;
		this.answersheet = answersheet;
		this.content = content;
		this.state = state;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAnswersheet() {
		return answersheet;
	}
	public void setAnswersheet(Integer answersheet) {
		this.answersheet = answersheet;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
