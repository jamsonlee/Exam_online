package com.project.three.examonline.service;

import com.project.three.examonline.domain.User;
import com.project.three.examonline.domain.User2;

import java.util.List;

/**
 * user的service层，包含增删改查方法。
 */
public interface UserService {

  /**
   * insert a user.
   * @param user 被添加的用户
   */
  void insertUser(User user);
  /**
   * delete a user.
   * @param user 被删除的user
   */
  void deleteUser(User user);
  /**
   * 修改用户的密码.
   * @param user 应存有 需要改动的id,被改后的密码
   */
  void updateUser(User user);
  /**
   * 返回与user相一致的用户
   * @param user 被查询的数据.
   * @return 用户
   */
  List<User> queryUser(User user);

  /**
   * 依据学工号查询姓名
   * @param userId 学工号
   * @return 姓名
   */
  String[] queryNameById(Integer userId);

  /**
   * 依据学工号查询身份为student的用户
   * @param studentId  学生的学工号
   * @return 具有姓名的student用户
   */
  List<User2> queryStudentById(String studentId);

  /**
   * 依据学工号查询身份为teacher的用户
   * @param teacherId 老师的学工号
   * @return 具有姓名的teacher用户
   */
  List<User2> queryTeacherById(String teacherId);

  /**
   * 依据学工号查询身份为administrator的用户
   * @param administratorId 管理员的学工号
   * @return  具有姓名的管理员用户
   */
  List<User2> queryAdministratorById(String administratorId);
}
