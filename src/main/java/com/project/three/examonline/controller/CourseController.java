package com.project.three.examonline.controller;

import com.project.three.examonline.domain.Course;
import com.project.three.examonline.domain.CourseUser;
import com.project.three.examonline.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("course")
public class CourseController {
    @Autowired
    private CourseService courseService;


    //新建课程
    @RequestMapping("insertCourse")
    public String insertCourse(Course course){
        System.out.println(course.getId()+","+course.getType()+","+course.getName());
        if (course != null && course.getName() != null && course.getType() != null){
            List<Course> query = courseService.queryCourse(course);
            if (query.size() == 0){
                courseService.insertCourse(course);
                return "redirect:/success.html";
            } else{
                return "redirect:/fail.html";
            }
        } else{
            return "redirect:/fail.html";
        }
    }

    //删除课程
    @RequestMapping("deleteCourse")
    public String deleteCourse(Course course){
        if (course != null && course.getId() != null && course.getType() != null && course.getName() != null){
            List<Course> query = courseService.queryCourse(course);
            if (query.size() != 0) {
                courseService.deleteCourse(course);
                return "redirect:/success.html";
            } else{
                return "redirect:/fail.html";
            }
        } else{
            return "redirect:/fail.html";
        }
    }

    //更新课程
    @RequestMapping("updateCourse")
    public String updateCourse(Course course){
        if (course != null && course.getId() != null){
            List<Course> query = courseService.queryCourse(course);
            if (query.size() != 0){
                courseService.updateCourse(course);
                return "redirect:/success.html";
            } else{
                return "redirect:/fail.html";
            }
        } else {
            return "redirect:/fail.html";
        }
    }

    //查询课程
    @RequestMapping("queryCourse")
    @ResponseBody
    public List<Course> queryCourse(String name){
        if (name != null){
            System.out.println("传来的参数"+name);
            Course course = new Course();
            course.setName(name);
            Course c = new Course(1,"wxw","wxw");
            List<Course> query = courseService.queryCourse(course);
            query.add(c);
            System.out.println(query.size());
            return query;
        } else{
            return null;
        }
    }

    //为某课程增加学生
    @RequestMapping("insertStudent")
    public String insertStudent(CourseUser cu){
        if (cu != null && cu.getCourseId() != null && cu.getUserId() != null) {
            //查询班级是否存在
            Course course = new Course();
            course.setId(cu.getCourseId());
            List<Course> query = courseService.queryCourse(course);
            //班级存在
            if (query.size() != 0) {
                //查询学生是否存在班级里面
                Integer student[] = courseService.queryStudent(cu.getCourseId());
                boolean exist = false;
                for (int temp : student) {
                    if (temp == cu.getUserId()) {
                        exist = true;
                    }
                }
                if (!exist) {
                    courseService.insertStudent(cu);
                    return "redirect:/success.html";
                }
            }
        }
        return "redirect:/fail.html";
    }

    //为某门课程删除学生
    @RequestMapping("deleteStudent")
    public String deleteStudent(CourseUser cu){
        if (cu != null && cu.getCourseId() != null && cu.getUserId() != null) {
            //查询班级是否存在
            Course course = new Course();
            course.setId(cu.getCourseId());
            List<Course> query = courseService.queryCourse(course);
            //班级存在
            if (query.size() != 0){
                Integer student[] = courseService.queryStudent(cu.getCourseId());
                boolean exist = false;
                for (int temp : student) {
                    if (temp == cu.getUserId()) {
                        exist = true;
                    }
                }
                if (exist){
                    courseService.deleteStudent(cu);
                    return "redirect:/success.html";
                }
            }
        }
        return "redirect:/fail.html";
    }

    //查询某门课程所有的学生
    @RequestMapping("queryStudent")
    public Integer[] queryStudent(Integer course){
        //判断存不存在这个课程
        Course temp = new Course();
        temp.setId(course);
        List<Course> query = courseService.queryCourse(temp);
        if (query.size() != 0){
            return courseService.queryStudent(course);
        } else{
            return null;
        }
    }

    //查询某个学生参与的所有课程
    @RequestMapping("queryCourseByS")
    public Integer[] queryCourseByS(Integer student){
        return courseService.queryCourseByS(student);
    }

    //为某门课程增加老师
    @RequestMapping("insertTeacher")
    public String insertTeacher(CourseUser cu){
        if (cu != null && cu.getCourseId() != null && cu.getUserId() != null) {
            //查询班级是否存在
            Course course = new Course();
            course.setId(cu.getCourseId());
            List<Course> query = courseService.queryCourse(course);
            //班级存在
            if (query.size() != 0) {
                //查询学生是否存在班级里面
                Integer teacher[] = courseService.queryTeacher(cu.getCourseId());
                boolean exist = false;
                for (int temp : teacher) {
                    if (temp == cu.getUserId()) {
                        exist = true;
                    }
                }
                if (!exist) {
                    courseService.insertTeacher(cu);
                    return "redirect:/success.html";
                }
            }
        }
        return "redirect:/fail.html";
    }

    //删除某门课程的老师
    @RequestMapping("deleteTeacher")
    public String deleteTeacher(CourseUser cu){
        if (cu != null && cu.getCourseId() != null && cu.getUserId() != null) {
            //查询班级是否存在
            Course course = new Course();
            course.setId(cu.getCourseId());
            List<Course> query = courseService.queryCourse(course);
            //班级存在
            if (query.size() != 0){
                Integer teacher[] = courseService.queryTeacher(cu.getCourseId());
                boolean exist = false;
                for (int temp : teacher) {
                    if (temp == cu.getUserId()) {
                        exist = true;
                    }
                }
                if (exist){
                    courseService.deleteTeacher(cu);
                    return "redirect:/success.html";
                }
            }
        }
        return "redirect:/fail.html";
    }

    //查询某门课程所有的老师
    @RequestMapping("queryTeacher")
    public Integer[] queryTeacher(Integer course){
        return courseService.queryTeacher(course);
    }

    //查询某老师参与的全部课程
    @RequestMapping("queryCourseByT")
    public Integer[] queryCourseByT(Integer teacher){
        return courseService.queryCourseByT(teacher);
    }
}
