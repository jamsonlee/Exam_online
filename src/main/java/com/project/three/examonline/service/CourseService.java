package com.project.three.examonline.service;

import com.project.three.examonline.domain.Course;
import com.project.three.examonline.domain.CourseUser;

import java.util.List;

public interface CourseService {

    /**
    增加课程
     @param course 要增加的课程
     */
    public void insertCourse(Course course);

    /**
     * 删除课程
     * @param course 要删除的课程
     */
    public void deleteCourse(Course course);

    /**
     * 更新课程
     * @param course 要更新的课程
     */
    public void updateCourse(Course course);

    /**
     * 查询课程
     * @param course 要查询的课程
     * @return 查询课程的结果
     */
    public List<Course> queryCourse(Course course);

    /**
     * 根据cu为一个课程添加student
     * @param cu 一个course-student对
     */
    public void insertStudent(CourseUser cu);

    /**
     * 根据cu为一个课程删除student
     * @param cu 一个course-student对
     */
    public void deleteStudent(CourseUser cu);

    /**
     * 根据课程id查询学生
     * @param course 课程id
     * @return 学生id的列表
     */
    public Integer[] queryStudent(Integer course);

    /**
     * 根据学生id查询课程
     * @param student 学生id
     * @return 课程id的列表
     */
    public Integer[] queryCourseByS(Integer student);

    /**
     * 根据cu为一个课程添加teacher
     * @param cu 一个course-teacher对
     */
    public void insertTeacher(CourseUser cu);

    /**
     * 根据cu为一个课程删除teacher
     * @param cu 一个course-teacher对
     */
    public void deleteTeacher(CourseUser cu);

    /**
     * 根据课程id查询老师
     * @param course 课程id
     * @return 老师id的列表
     */
    public Integer[] queryTeacher(Integer course);

    /**
     * 根据老师id查询课程
     * @param teacher 学生id
     * @return 课程id的列表
     */
    public Integer[] queryCourseByT(Integer teacher);
}
