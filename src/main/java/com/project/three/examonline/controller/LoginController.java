package com.project.three.examonline.controller;

import com.project.three.examonline.domain.User;
import com.project.three.examonline.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 这个类是login时的控制器
 */
@Controller
@RequestMapping("/login")
public class LoginController {
  @Autowired
  private UserServiceImp userServiceImp;

  /**
   * login 的控制器，TODO：未连接数据库.
   * @param identity 用户的身份，学生/老师/管理员
   * @param userId 学工号
   * @param password 密码
   * @return 密码正确，用户返回对应的界面；密码错误，返回登录界面并进行提醒。
   */
  @RequestMapping(value = "/main/{identity}/{userId}/{password}", method = RequestMethod.GET)
  @ResponseBody
  public String insertUser(@PathVariable("identity") String identity, @PathVariable("userId") String userId,
                           @PathVariable("password") String password){
    User user = new User(null, identity, userId, password);
    System.out.println(user);
    if(user.getIdentity() != null && user.getPassword() != null && user.getUserId() != null){
      //TODO: 查询一下user是不是已经存在，在确定登陆成功与否。
      //成功界面
      List<User> users =userServiceImp.queryUser(user);
        if(users!=null&&users.size()!=0){
        return "success";
      }
    }
    //失败界面
    return "failed";
  }
}
