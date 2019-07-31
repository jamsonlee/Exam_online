package com.project.three.examonline.domain;

public class Evaluate {
	private Integer id;
	private Integer student;
	private Integer evaluated;
	private Integer evaluate;
	public Evaluate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Evaluate(Integer id, Integer student, Integer evaluated, Integer evaluate) {
		super();
		this.id = id;
		this.student = student;
		this.evaluated = evaluated;
		this.evaluate = evaluate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getStudent() {
		return student;
	}
	public void setStudent(Integer student) {
		this.student = student;
	}
	public Integer getEvaluated() {
		return evaluated;
	}
	public void setEvaluated(Integer evaluated) {
		this.evaluated = evaluated;
	}
	public Integer getEvaluate() {
		return evaluate;
	}
	public void setEvaluate(Integer evaluate) {
		this.evaluate = evaluate;
	}
}
