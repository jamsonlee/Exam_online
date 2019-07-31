package com.project.three.examonline.domain;

public class PaperQuestion {
	private Integer paper;
	private String question;
	public PaperQuestion() {
		super();
	}
	public PaperQuestion(Integer paper, String question) {
		super();
		this.paper = paper;
		this.question = question;
	}
	public Integer getPaper() {
		return paper;
	}
	public void setPaper(Integer paper) {
		this.paper = paper;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
}
