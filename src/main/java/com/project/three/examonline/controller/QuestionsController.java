package com.project.three.examonline.controller;

import com.project.three.examonline.domain.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.project.three.examonline.service.QuestionService;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 这个类是管理Question的类，主要有增删改查几个方法.
 */
@Controller
@RequestMapping("question")
public class QuestionsController {
  List<Question> ques;
  static int index = 0;
  String type = "w";
  Integer courseId = -1;

  @Autowired
  private QuestionService questionServiceImp;


  //删除问题
  @RequestMapping("delete")
  public String DeleteQuestion(Question question){
    if (question != null){
      questionServiceImp.delete(question);
      return "redirect:/success.html";
    } else{
      return "redirect:/fail.html";
    }
  }

  //新建视频
  @RequestMapping("insert")
  public String insertQuestion(Question question){
     System.out.println(question.getQuestion() +","+question.getAnswer() );
     if (question != null && question.getType() != null && question.getPurpose() != null && question.getCourseId() != null &&question.getTeacherId() != null){

       List<Question> query = questionServiceImp.queryQuestion(question);
       if (query.size() == 0){
         questionServiceImp.insertQuestion(question);
         return "redirect:/success.html";
       } else{
         System.out.println("fail1");
         return "redirect:/fail.html";
       }
     } else{
       System.out.println("fail2");
       return "redirect:/fail.html";
     }
  }

  //更新问题
  @RequestMapping("update")
  public String updateQuestion(Question question){
    if (question != null && question.getId() != null){
      List<Question> query = questionServiceImp.queryQuestion(question);
      if (query.size() != 0){
        questionServiceImp.update(question);
        return "redirect:/success.html";
      } else{
        return "redirect:/fail.html";
      }
    } else{
      return "redirect:/fail.html";
    }
  }

  //更新问题
  @RequestMapping("update1")
  @ResponseBody
  public Question updateQuestion(int id,String question,String answer){
    Question question1 = new Question();
    question1.setId(id);
    question1.setAnswer(answer);
    question1.setQuestion(question);
    questionServiceImp.update(question1);
    return question1;
  }

  //根据类型和课程id查询问题
  @RequestMapping("query")
  @ResponseBody
  public List<Question> QueryQuestion(String type,Integer courseId) {
    System.out.println(type + "," + courseId);
    Question question = new Question();
    question.setType(type);
    question.setCourseId(courseId);
    if (question != null){
      List<Question> ques1 = questionServiceImp.queryQuestion(question);
      Question q = new Question(1,"single","practice","问题","answer","photo",1,1,2,1);
      ques1.add(q);
      System.out.println(ques1);
      return ques1;
    } else {
      return null;
    }
  }

  //根据题目id查询问题
  @RequestMapping("queryById")
  @ResponseBody
  public List<Question> QueryQuestion(int id) {
    Question question = new Question();
    question.setId(id);
    if (question != null){
      List<Question> ques1 = questionServiceImp.queryQuestion(question);
      Question q = new Question(1,"single","practice","问题","answer","photo",1,1,2,1);
      ques1.add(q);
      System.out.println(ques1);
      return ques1;
    } else {
      return null;
    }
  }

  //根据examId查询题目
  @RequestMapping("queryByExamId")
  @ResponseBody
  public List<Question> QueryQuestion3(int examId) {
    Question question = new Question();
    question.setCourseId(examId);
    if (question != null){
      List<Question> ques1 = questionServiceImp.queryQuestion(question);
      Question q = new Question(1,"single","practice","问题","answer","photo",1,1,2,1);
      ques1.add(q);
      System.out.println(ques1);
      return ques1;
    } else {
      return null;
    }
  }

  @RequestMapping("query1")
  @ResponseBody
  public int QueryQuestion1(String type,Integer courseId) {
    System.out.println(type + "," + courseId);
    if (this.type.equals(type) && this.courseId.equals(courseId)){
      Question question = this.ques.get(index);
      index++;
      return question.getId();
    } else {
      Question question = new Question();
      question.setType(type);
      question.setCourseId(courseId);
      ques = questionServiceImp.queryQuestion(question);
      //测试用
      Question q1 = new Question(1,"single","practice","问题","answer","photo",1,1,2,1);
      ques.add(q1);
      index = 0;
      if (index < this.ques.size()){
        Question q = ques.get(index);
        index++;
        System.out.println("the got id is "+q.getId());
        return q.getId();
      } else {
        return -1;
      }
    }
  }

  @RequestMapping("query2")
  @ResponseBody
  public Question QueryQuestion2(int id) {
    System.out.println("请求题目方法被执行");
    for (Question q:ques){
      if(q.getId() == id){
        return q;
      }
    }
    return null;
  }

}
