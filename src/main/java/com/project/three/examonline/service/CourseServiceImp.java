package com.project.three.examonline.service;

import com.project.three.examonline.domain.Course;
import com.project.three.examonline.domain.CourseUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.three.examonline.dao.CourseMapper;

import java.util.List;

@Service
public class CourseServiceImp implements CourseService{
    @Autowired
    private CourseMapper courseMapper;

    @Override
    public void insertStudent(CourseUser cu) {
        courseMapper.insertStudent(cu);
    }

    @Override
    public void deleteStudent(CourseUser cu) {
        courseMapper.deleteStudent(cu);
    }

    @Override
    public Integer[] queryStudent(Integer course) {
        return courseMapper.queryStudent(course);
    }

    @Override
    public Integer[] queryCourseByS(Integer student) {
        return courseMapper.queryCourseByS(student);
    }

    @Override
    public void insertTeacher(CourseUser cu) {
        courseMapper.insertTeacher(cu);
    }

    @Override
    public void deleteTeacher(CourseUser cu) {
        courseMapper.deleteTeacher(cu);
    }

    @Override
    public Integer[] queryTeacher(Integer course) {
        return courseMapper.queryTeacher(course);
    }

    @Override
    public Integer[] queryCourseByT(Integer teacher) {
        return courseMapper.queryCourseByT(teacher);
    }

    @Override
    public void insertCourse(Course course) {
        System.out.println("service course执行");
        courseMapper.insertCourse(course);
    }

    @Override
    public void deleteCourse(Course course) {
        courseMapper.deleteCourse(course);
    }

    @Override
    public void updateCourse(Course course) {
        courseMapper.updateCourse(course);
    }

    @Override
    public List<Course> queryCourse(Course course) {
        System.out.println("service course执行");
        return courseMapper.queryCourse(course);
    }
}
