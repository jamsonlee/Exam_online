package com.project.three.examonline.service;

import com.project.three.examonline.domain.Evaluate;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EvaluateService {
    public void insertEvaluateCourse(Evaluate evaluate);
    public void deleteEvaluateCourse(Evaluate evaluate);
    public void updateEvaluateCourse(Evaluate evaluate);
    public List<Evaluate> queryEvaluateCourse(Evaluate evaluate);

    public void insertEvaluateTeacher(Evaluate evaluate);
    public void deleteEvaluateTeacher(Evaluate evaluate);
    public void updateEvaluateTeacher(Evaluate evaluate);
    public List<Evaluate> queryEvaluateTeacher(Evaluate evaluate);

    public void insertEvaluatePaper(Evaluate evaluate);
    public void deleteEvaluatePaper(Evaluate evaluate);
    public void updateEvaluatePaper(Evaluate evaluate);
    public List<Evaluate> queryEvaluatePaper(Evaluate evaluate);
}
