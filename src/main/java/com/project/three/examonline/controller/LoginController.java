package com.project.three.examonline.controller;

import com.project.three.examonline.domain.User2;
import com.project.three.examonline.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("login")
public class LoginController {
    @Autowired
    private UserServiceImp userServiceImp;

    //登陆界面
    @RequestMapping("main")
    public String test(){
        System.out.println("test");
        return "redirect:/login/login.jsp";
    }

    //登陆界面传回参数，设置登陆状态
    @RequestMapping("login")
    public String login(HttpServletRequest req,String userName, String password,String identity){
        System.out.println("此方法被调用");
        //boolean student = identity.equals("student") && userName.equals("8848") && password.equals(123);
        //boolean teacher = identity.equals("teacher") && userName.equals("java") && password.equals(910);
        //boolean admin = identity.equals("admin") && userName.equals("java") && password.equals(666);
        List<User2> query = queryUser(userName,identity);
        System.out.println(query.size());
        if (query.size() == 1) {
            User2 user = query.get(0);
            System.out.println(user);
            HttpSession session = req.getSession();
            session.setAttribute("flag",userName);
            if (user.getPassword().equals(password)){
                if (identity.equals("student")) {
                    return "redirect:/student/studentMainFace.html";
                } else if (identity.equals("teacher")) {
                    return "redirect:/teacher/teacherMainFace.html";
                } else {
                    return "redirect:/informationManage/adminMainFace.html";
                }
            }

        }
        return "redirect:/login/login.jsp";

    }


    public List<User2> queryUser(String userId, String identity){
        System.out.println(userId+identity);
        if (userId == null||userId.equals("") || !(identity.equals("student") || identity.equals("admin") || identity.equals("teacher"))) {
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
