package com.project.three.examonline.dao;

import java.util.List;

import com.project.three.examonline.domain.CourseUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.project.three.examonline.domain.Course;

@Mapper
public interface CourseMapper {
		public void insertCourse(Course course);
		public void deleteCourse(Course course);
		public void updateCourse(Course course);
		public List<Course> queryCourse(Course course);

		public void insertStudent(CourseUser cu);
		public void deleteStudent(CourseUser cu);
		public Integer[] queryStudent(Integer course);
		public Integer[] queryCourseByS(Integer student);

		public void insertTeacher(CourseUser cu);
		public void deleteTeacher(CourseUser cu);
		public Integer[] queryTeacher(Integer course);
		public Integer[] queryCourseByT(Integer teacher);
}

