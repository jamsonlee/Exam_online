package com.project.three.examonline.service;

import com.project.three.examonline.dao.QuestionMapper;
import com.project.three.examonline.domain.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImp implements QuestionService {
  @Autowired
  private QuestionMapper questionMapper;
  @Override
  public void insertQuestion(Question question){
    questionMapper.insertQuestion(question);
  }

  @Override
  public void delete(Question question) {
    questionMapper.deleteQuestion(question);
  }

  @Override
  public void update(Question question) {
    questionMapper.updateQuestion(question);
  }

  @Override
  public List<Question> queryQuestion(Question question) {

    return questionMapper.queryQuestion(question);
  }


}
