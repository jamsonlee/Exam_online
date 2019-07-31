package com.project.three.examonline.domain;

/**
 * 用于表示试卷
 */
public class Paper {
	//fields
	private Integer id;
	private Integer points;
	private Integer passpoints;
	private Integer teacherId;
	private Integer courseId;
	/**
	 * id:数据库的Id
	 * teacherId:组卷人的数据库id
	 * courseId:所属课程的数据库id
	 * points:总分
	 * pass points:及格线
	 */
	
	//constructors
	public Paper() {
		super();
	}
	public Paper(Integer id, Integer points, Integer passpoints, Integer teacherId, Integer courseId) {
		super();
		this.id = id;
		this.points = points;
		this.passpoints = passpoints;
		this.teacherId = teacherId;
		this.courseId = courseId;
	}
	
	//methods
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}
	public Integer getPasspoints() {
		return passpoints;
	}
	public void setPasspoints(Integer passpoints) {
		this.passpoints = passpoints;
	}
	public Integer getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "Paper{" +
				"id=" + id +
				", points=" + points +
				", passpoints=" + passpoints +
				", teacherId=" + teacherId +
				", courseId=" + courseId +
				'}';
	}
}
