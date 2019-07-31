package com.project.three.examonline.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.project.three.examonline.domain.AnswerSheet;

@Mapper
public interface AnswerSheetMapper {
	public void insertAnswerSheet(AnswerSheet answersheet);
	public void deleteAnswerSheet(AnswerSheet answersheet);
	public void updateAnswerSheet(AnswerSheet answersheet);
	public List<AnswerSheet> queryAnswerSheet(AnswerSheet answersheet);
}
