package com.project.three.examonline.service;

import com.project.three.examonline.domain.AnswerSheet;

import java.util.List;

public interface AnswerSheetService {
    public void insertAnswerSheet(AnswerSheet answersheet);
    public void deleteAnswerSheet(AnswerSheet answersheet);
    public void updateAnswerSheet(AnswerSheet answersheet);
    public List<AnswerSheet> queryAnswerSheet(AnswerSheet answersheet);
}
