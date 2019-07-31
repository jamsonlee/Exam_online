package com.project.three.examonline.controller;

import com.project.three.examonline.domain.User;
import com.project.three.examonline.domain.User2;
import com.project.three.examonline.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * user功能的控制器,实现用户的增删改查功能.
 */
@Controller
@RequestMapping("/user")
public class UserController {
  @Autowired
  private UserServiceImp userServiceImp;

  /**
   * 增加一个用户.
   * @param userId 需要增加的用户id
   * @param identity 用户身份
   * @return 跳转的界面
   */
  @RequestMapping(value = "/insert", method = RequestMethod.GET)
  @ResponseBody
  public String insertUser(String userId, String password, String identity){
    User user = new User(null, identity, userId, password);
    System.out.println(user);
    if(identity!= null && password!=null&& !password.equals("") &&userId!= null&&!userId.equals("") ){
      if(userServiceImp.queryUser(user)!=null&&userServiceImp.queryUser(user).size()!=0){
        return "user have existed";
      }
      userServiceImp.insertUser(user);
      //成功界面
      return "success";
    }
    //失败界面
    return "账号或者密码未输入";
  }

  /**
   * 删除一个user，用户不存在则删除失败.
   * @param userId 学工号
   * @param identity 身份
   * @return 跳转的界面.
   */
  @RequestMapping("/delete")
  @ResponseBody
  public String deleteUser(String userId, String identity){
    User user = new User(null, identity, userId, null);
    if(identity!= null && userId!= null&&!userId.equals("") ){
      if(userServiceImp.queryUser(user)!=null&&userServiceImp.queryUser(user).size()==1){
        userServiceImp.deleteUser(user);
        return "deleteUserSuccess";
      }
    }
    return "deleteUserFailed";
  }

  /**
   * 更新一个用户,用户不存在则更新失败.
   * @param userId 学工号
   * @param identity 身份
   * @param password 密码
   *  @return 跳转的界面
   */
  @RequestMapping("/update")
  @ResponseBody
  public String updateUser(String userId, String identity, String password){
    User user = new User(null, identity, userId, null);
    System.out.println(user);
    System.out.println(password);
    if(identity!= null && password!=null&& !password.equals("") &&userId!= null&&!userId.equals("") ){
      if(userServiceImp.queryUser(user)!=null&&userServiceImp.queryUser(user).size()==1) {
        user.setPassword(password);
        System.out.println(user);
        userServiceImp.updateUser(user);
        return "updateUserSuccess";
      }
    }
    return "updateUserFailed";
  }

  /**
   * 查询一组user对象
   * @param userId 需要增加的用户id
   * @param identity 用户身份
   * @return 查询结果
   */
  @RequestMapping(value = "/query", method = RequestMethod.GET)
  @ResponseBody
  public List<User2> queryUser(String userId, String identity){
    System.out.println(userId+identity);
    if (userId == null||userId.equals("") || !(identity.equals("student") || identity.equals("administrator") || identity.equals("teacher"))) {
      return new ArrayList<>();
    } else {
      if(identity.equals("student")){
        return userServiceImp.queryStudentById(userId);
      }else if(identity.equals("teacher")){
        System.out.println(true);
        return userServiceImp.queryTeacherById(userId);
      } else {
        System.out.println(true);
        return userServiceImp.queryAdministratorById(userId);
      }
    }
  }
}
