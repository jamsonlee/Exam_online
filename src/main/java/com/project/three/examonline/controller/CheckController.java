package com.project.three.examonline.controller;

import com.project.three.examonline.domain.AnswerSheet;
import com.project.three.examonline.domain.Check;
import com.project.three.examonline.service.AnswerSheetService;
import com.project.three.examonline.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("check")
public class CheckController {
    @Autowired
    private CheckService checkService;

    @Autowired
    private AnswerSheetService answerSheetService;

    @RequestMapping("insert")
    public String InsertCheck(Integer studentId,Integer examId) {
        System.out.println(studentId+","+examId);
        AnswerSheet temp = new AnswerSheet();
        temp.setExamId(examId);
        temp.setStudentId(studentId);
        //这个学生的答题卡
        List<AnswerSheet> ans = answerSheetService.queryAnswerSheet(temp);
        if (ans.size() != 0){
            Check check = new Check();
            check.setAnswersheet(ans.get(0).getId());
            check.setState("未审核");
            checkService.InsertCheck(check);
            return "redirect:/success.html";
        } else {
            return "redirect:/fail.html";
        }
    }

   @RequestMapping("update")
    public String updateCheck(Check check) {
        if (check != null && check.getId() != null){
            checkService.updateCheck(check);
            return "redirect:/success.html";
        } else {
            return "redirect:/fail.html";
        }
    }

    @RequestMapping("query")
    public List<Check> queryCheck(Check check) {
        System.out.println(checkService==null);
        if (check != null && check.getId() != null && check.getAnswersheet() != null && check.getState() != null && check.getContent() != null){
            return checkService.queryCheck(check);
         } else {
            return null;
        }
    }
}
