package com.project.three.examonline.service;

import com.project.three.examonline.dao.UserMapper;
import com.project.three.examonline.domain.User;
import com.project.three.examonline.domain.User2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{
  @Autowired
  private UserMapper userMapper;

  @Override
  public void insertUser(User user) {
    userMapper.insertUser(user);
  }

  @Override
  public void deleteUser(User user) {
    userMapper.deleteUser(user);
  }
  @Override
  public void updateUser(User user){
    userMapper.updateUser(user);
  }
  @Override
  public List<User> queryUser(User user){
    return userMapper.queryUser(user);
  }

  @Override
  public String[] queryNameById(Integer userId) {
    return userMapper.queryNameById(userId.toString());
  }

  @Override
  public List<User2> queryStudentById(String studentId) {
    return userMapper.queryStudentById(studentId);
  }

  @Override
  public List<User2> queryTeacherById(String teacherId) {
    return userMapper.queryTeacherById(teacherId);
  }

  @Override
  public List<User2> queryAdministratorById(String administratorId) {
    return userMapper.queryAdministratorById(administratorId);
  }
}
