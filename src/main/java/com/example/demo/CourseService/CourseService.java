package com.example.demo.CourseService;

import com.example.demo.CourseRepository.CourseRepository;
import com.example.demo.CourseRepository.GradeRepository;
import com.example.demo.DTO.CourseGradeDTO;
import com.example.demo.Models.Course;
import com.example.demo.Models.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private GradeRepository gradeRepository;


    public Course getCourseByCode(Long courseCode) {
        return courseRepository.findById(courseCode).orElse(null);
    }

    public CourseGradeDTO getCourseGrade(Long courseCode) {
        Course course = getCourseByCode(courseCode);
        if (course == null){
            return null;
        }
        List<Grade> grades = gradeRepository.findByCourse_CourseCode(courseCode);
        return new CourseGradeDTO(course.getCourseName(), grades);
    }

}

