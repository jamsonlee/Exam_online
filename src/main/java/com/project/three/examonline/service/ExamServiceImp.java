package com.project.three.examonline.service;

import com.project.three.examonline.dao.ExamMapper;
import com.project.three.examonline.domain.Exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamServiceImp implements ExamService {
  @Autowired
  private ExamMapper examMapper;

  @Override
  public void insertExam(Exam exam) {
    examMapper.insertExam(exam);
  }

  @Override
  public void deleteExam(Exam exam) {
    examMapper.deleteExam(exam);
  }

  @Override
  public void updateExam(Exam exam) {
    examMapper.updateExam(exam);
  }


  @Override
  public List<Exam> queryExam(Exam exam){
    return examMapper.queryExam(exam);
  }

  @Override
  public List<Exam> queryExamByStudent(Integer studentId) {
    return examMapper.queryExamByStudent(studentId);
  }
}
