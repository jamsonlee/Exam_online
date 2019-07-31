package com.project.three.examonline.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.project.three.examonline.domain.Question;


@Mapper
public interface QuestionMapper {
	public void insertQuestion(Question question);
	public void deleteQuestion(Question question);
	public void updateQuestion(Question question);
	public List<Question> queryQuestion(Question question);
}
