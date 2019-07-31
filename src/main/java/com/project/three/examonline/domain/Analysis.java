package com.project.three.examonline.domain;

public class Analysis {
	private Integer id;
	private Integer examId;
	private Integer max;
	private Integer min;
	private Integer average;
	private Integer allNumber;
	private Integer passNumber;
	public Analysis() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Analysis(Integer examId) {
		super();
		this.examId = examId;
	}


	public Analysis(Integer id, Integer examId, Integer max, Integer min, Integer average, Integer allNumber,
			Integer passNumber) {
		super();
		this.id = id;
		this.examId = examId;
		this.max = max;
		this.min = min;
		this.average = average;
		this.allNumber = allNumber;
		this.passNumber = passNumber;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getExamId() {
		return examId;
	}
	public void setExamId(Integer examId) {
		this.examId = examId;
	}
	public Integer getMax() {
		return max;
	}
	public void setMax(Integer max) {
		this.max = max;
	}
	public Integer getMin() {
		return min;
	}
	public void setMin(Integer min) {
		this.min = min;
	}
	public Integer getAverage() {
		return average;
	}
	public void setAverage(Integer average) {
		this.average = average;
	}
	public Integer getAllNumber() {
		return allNumber;
	}
	public void setAllNumber(Integer allNumber) {
		this.allNumber = allNumber;
	}
	public Integer getPassNumber() {
		return passNumber;
	}
	public void setPassNumber(Integer passNumber) {
		this.passNumber = passNumber;
	}
}
