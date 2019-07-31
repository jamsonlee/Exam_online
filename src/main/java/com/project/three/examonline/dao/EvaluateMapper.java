package com.project.three.examonline.dao;

import java.util.List;

import com.project.three.examonline.domain.Evaluate;

public interface EvaluateMapper {
	public void insertEvaluateCourse(Evaluate evaluate);
	public void deleteEvaluateCourse(Evaluate evaluate);
	public void updateEvaluateCourse(Evaluate evaluate);
	public List<Evaluate> queryEvaluateCourse(Evaluate evaluate);
	
	/**
	 * 依据学生的数据库id 查询所有他做的对课程的评价
	 */
	public List<Evaluate> queryEvaluateCourseByStudent(Integer student);
	
	public void insertEvaluateTeacher(Evaluate evaluate);
	public void deleteEvaluateTeacher(Evaluate evaluate);
	public void updateEvaluateTeacher(Evaluate evaluate);
	public List<Evaluate> queryEvaluateTeacher(Evaluate evaluate);
	
	/**
	 * 依据学生的数据库id 查询所有他做的对老师的评价
	 */
	public List<Evaluate> queryEvaluateTeacherByStudent(Integer student);
	
	public void insertEvaluatePaper(Evaluate evaluate);
	public void deleteEvaluatePaper(Evaluate evaluate);
	public void updateEvaluatePaper(Evaluate evaluate);
	public List<Evaluate> queryEvaluatePaper(Evaluate evaluate);
	
	/**
	 * 依据学生的数据库id 查询所有他做的对试卷的评价
	 */
	public List<Evaluate> queryEvaluatePaperByStudent(Integer student);
}
