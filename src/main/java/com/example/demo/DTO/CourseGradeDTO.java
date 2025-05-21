package com.example.demo.DTO;

import com.example.demo.Models.Grade;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseGradeDTO {
    private String courseName;
    private List<Grade> grades;

}
