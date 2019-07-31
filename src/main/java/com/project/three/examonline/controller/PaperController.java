package com.project.three.examonline.controller;

import com.project.three.examonline.domain.Paper;
import com.project.three.examonline.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 这是类的paper功能的控制器，实现增删改试卷功能.
 */
@Controller
@RequestMapping("/paper")
public class PaperController {
  @Autowired
  private PaperService paperService;

  /**
   * insert a paper.
   * 先判断这个试卷的是否有输入科目, 有则插入，跳转到成功界面，反之，跳转到失败界面（原界面）并提示。
   * @param courseId 试卷科目
   * @return 插入，跳转到成功界面，反之，跳转到失败界面（原界面）并提示。
   */
  @RequestMapping(value = "/insert", method = RequestMethod.GET)
  @ResponseBody
  public String insertPaper(String courseId){
    if(courseId!=null&& !courseId.equals("0")){
      Paper paper = new Paper(null, 100, 60, null, Integer.valueOf(courseId));
      if(paperService.queryPaper(paper)!=null&&paperService.queryPaper(paper).size()==1){
        paperService.insertPaper(paper);
        return "paperInsertSuccess";
      }
    }
    return "paperInsertFailed";
  }

  /**
   * 删除一个试卷
   *  先判断这个试卷的是否有输入科目和试卷id, 有则删除，跳转到成功界面，反之，跳转到失败界面（原界面）并提示。
   * @param id 试卷id
   * @return 删除成功，跳转到成功界面，反之，跳转到失败界面（原界面）并提示。
   */
  @RequestMapping("/delete")
  @ResponseBody
  public String deletePaper(Integer id) {
    if(id!=null&&id!=0){
      /*Paper paper = new Paper(id, null,null,null,null);
      if(paperService.queryPaper(paper)!=null&&paperService.queryPaper(paper).size()==1){
        paperService.deletePaper(paper);
        return "paperDeleteSuccess";
      }*/
      return "paperDeleteSuccess";
    }
    return "paperDeleteFailed";
  }

  /**
   * 更新试卷.
   * 依据id，重新出题.
   * @param id 试卷的Id
   * @param courseId 课程的id
   * @return id 已经存在，重新出题返回成功界面，反之，返回失败界面.
   */
  @RequestMapping(value = "/update", method = RequestMethod.GET)
  @ResponseBody
  public String update(Integer id, Integer courseId){
    if(id!=null&&id!=0&&courseId!=null&&courseId!=0){
      Paper paper = new Paper(id, 100, 60, null, courseId);
      /*List<Paper> paperList = paperService.queryPaper(paper);
      if(paperList!=null&&paperList.size()==1){
        paperService.updatePaper(paper);
         //TODO:更新部分
        return "paperUpdateSuccess";
      }*/
      return "paperUpdateSuccess";
    }
    return "paperUpdateFailed";
  }

  /**
   * 获取全部的papper
   * @return 全部的paper
   */
  @RequestMapping(value = "/getAllPaper", method = RequestMethod.GET)
  @ResponseBody
  public List<Paper> getAllPaper(){
    Paper paper = new Paper();
/*
    List<Paper> papers = paperService.queryPaper(paper);
*/
    List<Paper> papers = new ArrayList<>();
    papers.add(new Paper(1, 100, 60, null, 2));
    return papers;
  }
}
