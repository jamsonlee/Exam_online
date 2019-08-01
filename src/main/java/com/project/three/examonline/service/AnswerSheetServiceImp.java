package com.project.three.examonline.service;

import com.project.three.examonline.dao.AnswerSheetMapper;
import com.project.three.examonline.domain.AnswerSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AnswerSheetServiceImp implements AnswerSheetService {
    @Autowired
    private AnswerSheetMapper answerSheetMapper ;


    @Override
    public void insertAnswerSheet(AnswerSheet answersheet) {
        answerSheetMapper.insertAnswerSheet(answersheet);
    }

    @Override
    public void deleteAnswerSheet(AnswerSheet answersheet) {
        answerSheetMapper.deleteAnswerSheet(answersheet);
    }

    @Override
    public void updateAnswerSheet(AnswerSheet answersheet) {
        answerSheetMapper.updateAnswerSheet(answersheet);
    }

    @Override
    public List<AnswerSheet> queryAnswerSheet(AnswerSheet answersheet) {
        System.out.println("service层执行");
        return answerSheetMapper.queryAnswerSheet(answersheet);
    }
}
