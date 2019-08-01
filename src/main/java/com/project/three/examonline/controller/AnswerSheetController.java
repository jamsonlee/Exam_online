package com.project.three.examonline.controller;

import com.project.three.examonline.domain.AnswerSheet;
import com.project.three.examonline.service.AnswerSheetService;
import com.project.three.examonline.service.AnswerSheetServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("answersheet")
public class AnswerSheetController {

    @Autowired
    private AnswerSheetService answerSheetService = new AnswerSheetServiceImp();

    //新建答题卡
    @RequestMapping("insert")
    public String insertSheet(AnswerSheet answersheet){
        if (answersheet != null && answersheet.getStudentId() != null && answersheet.getExamId() != null){
            List<AnswerSheet> query = answerSheetService.queryAnswerSheet(answersheet);
            if (query.size() == 0){
                answerSheetService.insertAnswerSheet(answersheet);
                return "redirect:/success.html";
            }
        }
        answerSheetService.insertAnswerSheet(answersheet);
        return "redirect:/fail.html";
    }

    public static HttpSession getsession() {
             return getRequest().getSession();
    }

    public static HttpServletRequest getRequest() {
          ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
          HttpServletRequest request = requestAttributes.getRequest();
          return request;
    }

    @RequestMapping("insert2")
    @ResponseBody
    public String insertSheet(String content,int examId){
        String userName = (String)getsession().getAttribute("flag");
        System.out.println(userName);
        int studentId = Integer.parseInt(userName);
        System.out.println("studentId="+studentId);
        AnswerSheet answerSheet = new AnswerSheet();
        answerSheet.setAnswer(content);
        answerSheet.setExamId(examId);
        answerSheet.setStudentId(studentId);
        answerSheetService.insertAnswerSheet(answerSheet);
        return "redirect:/success.html";
    }
    //删除答题卡
    @RequestMapping("delete")
    public String deleteSheet(AnswerSheet answersheet){
        if (answersheet != null){
            answerSheetService.deleteAnswerSheet(answersheet);
            return "redirect:/success.html";
        }
        return "redirect:/fail.html";
    }

    //更新答题卡
    @RequestMapping("update")
    public String updateSheet(AnswerSheet answersheet){
        if (answersheet != null && answersheet.getId() != null){
            List<AnswerSheet> query = answerSheetService.queryAnswerSheet(answersheet);
            if (query.size() != 0){
                answerSheetService.updateAnswerSheet(answersheet);
                return "redirect:/success.html";
            }
        }
        return "redirect:/fail.html";
    }

    //查询答题卡
    @RequestMapping("query")
    @ResponseBody
    public List<AnswerSheet> querySheet(AnswerSheet answerSheet){
        if ((answerSheet != null)){
            return answerSheetService.queryAnswerSheet(answerSheet);
        } else{
            return new ArrayList<AnswerSheet>();
        }
    }
}
