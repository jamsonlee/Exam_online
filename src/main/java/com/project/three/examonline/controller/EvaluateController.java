package com.project.three.examonline.controller;

import com.project.three.examonline.domain.Evaluate;
import com.project.three.examonline.service.EvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("evaluate")
public class EvaluateController {
    @Autowired
    private EvaluateService evaluateService;

    //增加对某门课程的评价
    @RequestMapping("insertCourse")
    public String insertEvaluateCourse(int studentId,int courseId,int evaluate){
        Evaluate added = new Evaluate();
        added.setStudent(studentId);
        added.setEvaluated(courseId);
        added.setEvaluate(evaluate);
        if (added != null && added.getEvaluate() != null && added.getEvaluated() != null && added.getStudent() != null){
            evaluateService.insertEvaluateCourse(added);
            return "redirect:/success.html";
        } else {
            return "redirect:/fail.html";
        }
    }

    //删除对某门课程的评价
    @RequestMapping("deleteCourse")
    public String deleteEvaluateCourse(Evaluate evaluate) {
        if (evaluate != null && evaluate.getEvaluate() != null && evaluate.getEvaluated() != null && evaluate.getStudent() != null && evaluate.getId() != null){
            evaluateService.deleteEvaluateCourse(evaluate);
            return "redirect:/success.html";
        } else {
            return "redirect:/fail.html";
        }
    }

    //更新对某门课程的评分
    @RequestMapping("updateCourse")
    public String updateEvaluateCourse(Evaluate evaluate) {
        if (evaluate != null && evaluate.getId() != null){
            evaluateService.updateEvaluateCourse(evaluate);
            return "redirect:/success.html";
        } else {
            return "redirect:/fail.html";
        }
    }

    //查询某门课程的评分
    @RequestMapping("queryCourse")
    public List<Evaluate> queryEvaluateCourse(Evaluate evaluate) {
        if (evaluate != null){
            return evaluateService.queryEvaluateCourse(evaluate);
        } else {
            return null;
        }
    }

    //新建对某个老师的评分
    @RequestMapping("insertTeacher")
    public String insertEvaluateTeacher(int studentId,int teacherId,int evaluate){
        Evaluate added = new Evaluate();
        added.setStudent(studentId);
        added.setEvaluated(teacherId);
        added.setEvaluate(evaluate);
        if (added != null && added.getEvaluate() != null && added.getEvaluated() != null && added.getStudent() != null){
            evaluateService.insertEvaluateCourse(added);
            return "redirect:/success.html";
        } else {
            return "redirect:/fail.html";
        }
    }

    //删除对某个老师的评分
    @RequestMapping("deleteTeacher")
    public String deleteEvaluateTeacher(Evaluate evaluate) {
        if (evaluate != null && evaluate.getEvaluate() != null && evaluate.getEvaluated() != null && evaluate.getStudent() != null && evaluate.getId() != null){
            evaluateService.deleteEvaluateTeacher(evaluate);
            return "redirect:/success.html";
        } else {
            return "redirect:/fail.html";
        }
    }

    //更新对某个老师的评分
    @RequestMapping("updateTeacher")
    public String updateEvaluateTeacher(Evaluate evaluate){
        if (evaluate != null && evaluate.getId() != null){
            evaluateService.updateEvaluateTeacher(evaluate);
            return "redirect:/success.html";
        } else {
            return "redirect:/fail.html";
        }
    }

    //查询某个老师的评分
    @RequestMapping("queryTeacher")
    public List<Evaluate> queryEvaluateTeacher(Evaluate evaluate){
        if (evaluate != null){
            return evaluateService.queryEvaluateTeacher(evaluate);
        } else {
            return null;
        }
    }

    //新建对试卷的评分
    @RequestMapping("insertPaper")
    public String insertEvaluatePaper(int studentId,int examId,int evaluate) {
        Evaluate added = new Evaluate();
        added.setStudent(studentId);
        added.setEvaluated(examId);
        added.setEvaluate(evaluate);
        if (added != null && added.getEvaluate() != null && added.getEvaluated() != null && added.getStudent() != null){
            evaluateService.insertEvaluateCourse(added);
            return "redirect:/success.html";
        } else {
            return "redirect:/fail.html";
        }
    }

    //删除对试卷的评分
    @RequestMapping("deletePaper")
    public String deleteEvaluatePaper(Evaluate evaluate) {
        if (evaluate != null && evaluate.getEvaluate() != null && evaluate.getEvaluated() != null && evaluate.getStudent() != null && evaluate.getId() != null){
            evaluateService.deleteEvaluatePaper(evaluate);
            return "redirect:/success.html";
        } else {
            return "redirect:/fail.html";
        }
    }

    //更新对试卷的评分
    @RequestMapping("updatePaper")
    public String updateEvaluatePaper(Evaluate evaluate){
        if (evaluate != null && evaluate.getId() != null){
            evaluateService.updateEvaluatePaper(evaluate);
            return "redirect:/success.html";
        } else {
            return "redirect:/fail.html";
        }
    }

    //查询对试卷的评分
    @RequestMapping("queryPaper")
    public List<Evaluate> queryEvaluatePaper(Evaluate evaluate) {
        if (evaluate != null){
            return evaluateService.queryEvaluatePaper(evaluate);
        } else {
            return null;
        }
    }
}
