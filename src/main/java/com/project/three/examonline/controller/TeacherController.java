package com.project.three.examonline.controller;

import com.project.three.examonline.domain.Analysy;
import com.project.three.examonline.domain.AnswerSheet;
import com.project.three.examonline.domain.Question;
import com.project.three.examonline.service.AnswerSheetService;
import com.project.three.examonline.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping(value = "teacher", method = RequestMethod.GET)
public class TeacherController {
    @Autowired
    private AnswerSheetService answerSheetService;
    @Autowired
    private QuestionService questionService;

    @RequestMapping("analysy")
    @ResponseBody
    public List<Analysy> analysy(int examId){
        System.out.println("方法被执行"+examId);
        AnswerSheet answerSheet = new AnswerSheet();
        answerSheet.setExamId(examId);
        List<AnswerSheet> answerSheets = answerSheetService.queryAnswerSheet(answerSheet);
        if (answerSheets.size() == 0){
            return null;
        }
        double average = 0;
        int max = 0;
        int min = 0;
        double sum = 0;
        int pass = 0;
        int notpass = 0;
        double zhongwei = 0;
        List<Integer> scores = new ArrayList<>();
        for (AnswerSheet temp : answerSheets){
            int score = Integer.parseInt(temp.getScore());
            scores.add(score);
            if (score > max){
                max = score;
            } else if (score < min){
                min = score;
            }
            if (score >= 60){
                pass++;
            }
            sum += score;
        }
        Collections.sort(scores);
        int size = scores.size();
        int index = (size - 1) / 2;
        if (size % 2 == 1){
            zhongwei = scores.get(index);
        } else {
            zhongwei = (scores.get(index) + scores.get(index + 1))/2;
        }
        average = sum / size;
        notpass = size - pass;
        Analysy ans = new Analysy(size,pass,notpass,average,max,min,zhongwei,examId);
        Analysy ans1 = new Analysy(1,1,1,1,1,1,1,1);
        List<Analysy> list = new ArrayList<>();
        list.add(ans1);

        return list;
    }


    @RequestMapping("teacherQA")
    public void teacherQA(int id,int courseId,String ques,String answer){
        Question q = new Question();
        q.setId(id);
        q.setCourseId(courseId);
        q.setQuestion(ques);
        q.setAnswer(answer);
        questionService.update(q);
    }
}
