package com.project.three.examonline.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.project.three.examonline.domain.User;
import com.project.three.examonline.domain.User2;

@Mapper
public interface UserMapper {
	public void insertUser(User user);
	public void deleteUser(User user);
	
	/**
	 * 修改用户的密码.
	 * @param user 应存有 需要改动的id,被改后的密码
	 */
	public void updateUser(User user);
	
	/**
	 * 返回与user相一致的用户
	 * @param user
	 * @return 用户
	 */
	public List<User> queryUser(User user);
	
	/**
	 * 依据姓名查询身份为学生的用户
	 * @param name 学生姓名
	 * @return 姓名为name的学生用户
	 */
	public List<User> queryStudentByName(String name);
	
	/**
	 * 依据姓名查询身份为老师的用户
	 * @param name 老师姓名
	 * @return 姓名为name的老师用户
	 */
	public List<User> queryTeacherByName(String name);
	
	/**
	 * 依据姓名查询身份为管理员的用户
	 * @param name 管理员姓名
	 * @return 姓名为name的管理员用户
	 */
	public List<User> queryAdministratorByName(String name);
	
	/**
	 * 依据性别查询身份为学生的用户
	 * @param sex 学生性别
	 * @return 性别为sex的学生用户
	 */
	public List<User> queryStudentBySex(String sex);
	
	/**
	 * 依据性别查询身份为老师的用户
	 * @param sex 老师性别
	 * @return 性别为sex的老师用户
	 */
	public List<User> queryTeacherBySex(String sex);
	
	/**
	 * 依据性别查询身份为管理员的用户
	 * @param sex 管理员性别
	 * @return 性别为sex的管理员用户
	 */
	public List<User> queryAdministratorBySex(String sex);
	
	/**
	 * 依据学工号查询姓名
	 * @param schoolId 学工号
	 * @return 姓名
	 */
	public String[] queryNameById(String schoolId);
	
	public String queryStudentNameById(String schoolId);
	public String queryTeacherNameById(String schoolId);
	public String queryAdministratorNameById(String schoolId);

	/**
	 * 依据学工号查询身份为student的用户
	 * @param studentId  学生的学工号
	 * @return 具有姓名的student用户
	 */
	public List<User2> queryStudentById(String studentId);
	
	/**
	 * 依据学工号查询身份为teacher的用户
	 * @param teacherId 老师的学工号
	 * @return 具有姓名的teacher用户
	 */
	public List<User2> queryTeacherById(String teacherId);
	
	/**
	 * 依据学工号查询身份为administrator的用户
	 * @param administratorId 管理员的学工号
	 * @return  具有姓名的管理员用户
	 */
	public List<User2> queryAdministratorById(String administratorId);
}
