package com.project.three.examonline.service;

import com.project.three.examonline.domain.Question;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface QuestionService {

  /**
   * 增加试题
   * @param question 题干
   */
  void insertQuestion(Question question);

  /**
   * 删除题目
   * @param question 题目
   */
  void delete(Question question);

  /**
   * 修改题目
   * @param question 题母
   */
  void update(Question question);

  /**
   * 查询题目
   * @oaram ques 要查询的题目
   */
  List<Question> queryQuestion(Question question);
}
