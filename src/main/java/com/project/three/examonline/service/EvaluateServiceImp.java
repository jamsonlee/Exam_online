package com.project.three.examonline.service;

import com.project.three.examonline.dao.EvaluateMapper;
import com.project.three.examonline.domain.Evaluate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluateServiceImp implements EvaluateService {
    @Autowired
    private EvaluateMapper evaluateMapper;

    @Override
    public void insertEvaluateCourse(Evaluate evaluate) {
        evaluateMapper.insertEvaluateCourse(evaluate);
    }

    @Override
    public void deleteEvaluateCourse(Evaluate evaluate) {
        evaluateMapper.deleteEvaluateCourse(evaluate);
    }

    @Override
    public void updateEvaluateCourse(Evaluate evaluate) {
        evaluateMapper.updateEvaluateCourse(evaluate);
    }

    @Override
    public List<Evaluate> queryEvaluateCourse(Evaluate evaluate) {
        return evaluateMapper.queryEvaluateCourse(evaluate);
    }

    @Override
    public void insertEvaluateTeacher(Evaluate evaluate) {
        evaluateMapper.insertEvaluateCourse(evaluate);
    }

    @Override
    public void deleteEvaluateTeacher(Evaluate evaluate) {
        evaluateMapper.deleteEvaluateTeacher(evaluate);
    }

    @Override
    public void updateEvaluateTeacher(Evaluate evaluate) {
        evaluateMapper.updateEvaluateTeacher(evaluate);
    }

    @Override
    public List<Evaluate> queryEvaluateTeacher(Evaluate evaluate) {
        return evaluateMapper.queryEvaluateTeacher(evaluate);
    }

    @Override
    public void insertEvaluatePaper(Evaluate evaluate) {
        evaluateMapper.insertEvaluatePaper(evaluate);
    }

    @Override
    public void deleteEvaluatePaper(Evaluate evaluate) {
        evaluateMapper.deleteEvaluatePaper(evaluate);
    }

    @Override
    public void updateEvaluatePaper(Evaluate evaluate) {
        evaluateMapper.updateEvaluatePaper(evaluate);
    }

    @Override
    public List<Evaluate> queryEvaluatePaper(Evaluate evaluate) {
        return evaluateMapper.queryEvaluatePaper(evaluate);
    }
}
