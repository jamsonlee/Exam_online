package com.project.three.examonline.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.project.three.examonline.domain.Exam;


@Mapper
public interface ExamMapper {
	public void insertExam(Exam exam);
	public void deleteExam(Exam exam);
	public void updateExam(Exam exam);
	public List<Exam> queryExam(Exam exam);
	
	/**
	 * 依据学生的数据库id查询所有与他相关的考试
	 */
	public List<Exam> queryExamByStudent(Integer student);
}
