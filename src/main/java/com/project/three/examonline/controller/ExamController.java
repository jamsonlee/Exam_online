package com.project.three.examonline.controller;

import com.project.three.examonline.domain.Exam;
import com.project.three.examonline.domain.User2;
import com.project.three.examonline.service.ExamService;
import com.project.three.examonline.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 * 这是exam功能的controller模块，里面有考试的增删改的控制器.
 */
@Controller
@RequestMapping("/exam")
public class ExamController {
  @Autowired
  private ExamService examService;
  @Autowired
  private UserService userService;
  /**
   * 增加一场考试.
   * @param time 考试时间（可以为空）
   * @param courseId 课程id
   * @param paperId 试卷id
   * @return 成功和失败结果提示
   */
  @RequestMapping(value = "/insert", method = RequestMethod.GET)
  @ResponseBody
  public String insertExam(String time, String courseId, String paperId){
    if(time.equals("0")){
      time="00:120:00"; //怎么表示120min
    }
    //TODO: 解决时间问题。
    Exam exam = new Exam(null,new Time(111), Integer.valueOf(courseId), Integer.valueOf(paperId));
    if(exam.getCourse()!=null && exam.getCourse()!=0 && exam.getPaper()!=null && exam.getPaper()!=null){
      //TODO:连接数据库
      //examService.insertExamSheet(exam);
      return "insertExamSuccess";
    }else {
      return "insertExamFailed";
    }
  }

  /**
   * 删除考试（先查询确定是否存在这个exam）
   * @param id 考试Id
   * @return 跳转界面
   */
  @RequestMapping(value = "/delete", method = RequestMethod.GET)
  @ResponseBody
  public String deleteExam(Integer id){
    Exam exam = new Exam(id, null, null, null);
    if(id!=null&&id!=0){
      if(examService.queryExam(exam)!=null&&examService.queryExam(exam).size()==1){
        examService.deleteExam(exam);
        return "deleteExamSuccess";
      }
    }
    return "deleteExamFailed";
  }

  /**
   * 更新考试（先查询确定是否存在exam,就更新）
   * @param id 旧的考试id
   * @param courseId 课程id
   * @param paperId 试卷id
   * @return 更新成功和失败信息
   */
  @RequestMapping(value = "/update", method = RequestMethod.GET)
  @ResponseBody
  public String updateExam(Integer id, String courseId, String paperId){
    Exam exam = new Exam(id, null, null, null);
    if(exam.getCourse() != null && exam.getPaper() != null){
      if(examService.queryExam(exam)!=null && examService.queryExam(exam).size()==1){
        exam.setCourse(Integer.valueOf(courseId));
        exam.setPaper(Integer.valueOf(paperId));
        examService.updateExam(exam);
        return "updateExamSuccess";
      }
    }
    return "updateExamFailed";
  }

  /**
   * 按照考试id获取相应的考试
   * @param id 考试id
   * @return 找到返回exam，否则返回null
   */
  @RequestMapping("/getExamById")
  @ResponseBody
  public Exam getExamById(Integer id){
    if(id!=null&&id!=0){
      Exam exam = new Exam(id, null, null, null);
      List<Exam> exams = examService.queryExam(exam);
      if(exams!=null&&exams.size()==1){
        return exams.get(0);
      }
    }
    return null;
  }
  @RequestMapping("/alltest")
  @ResponseBody
  public List<Exam> getAllExam(){
    return examService.queryExam(new Exam());
  }

  @RequestMapping(value = "/getstudentexam", method = RequestMethod.GET)
  @ResponseBody
  public List<Exam> getExamByStudentId(){

    //TODO: 更新获取id, 通过session
   /* if(id!=null&&id!=0){
    List<User2> user2s = userService.queryStudentById(String.valueOf(id))
    if(user2s!=null&&user2s.size()==1){
      User2 user2 = user2s.get(0);
      return examService.queryExamByStudent(id);
    }
    List<Exam> exams = new ArrayList<>();
    exams.add(new Exam(1, null, 2, 3));
    return exams;
    }*/
    return new ArrayList<>();
  }
}
