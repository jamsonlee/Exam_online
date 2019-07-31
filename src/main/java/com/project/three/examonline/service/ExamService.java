package com.project.three.examonline.service;

import com.project.three.examonline.domain.Exam;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * exam模块的Service接口，包含增删改三个功能.
 */
@Service
public interface ExamService {
  void insertExam(Exam exam);
  void deleteExam(Exam exam);
  void updateExam(Exam exam);
  List<Exam> queryExam(Exam exam);
  List<Exam> queryExamByStudent(Integer student);
}
