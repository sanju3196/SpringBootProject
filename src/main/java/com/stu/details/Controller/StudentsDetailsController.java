package com.stu.details.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stu.details.Entity.StudentsDetails;
import com.stu.details.Service.StudentsDetailsService;

@RestController
public class StudentsDetailsController {
    @Autowired
    StudentsDetailsService studentService;

    @PostMapping("/addstudent")
    public String createStudent(@RequestBody StudentsDetails student) {
        return studentService.createStudent(student);
    }

    @GetMapping("/getAllStudents")
    public List<StudentsDetails> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/getstudentbyid/{id}")
    public StudentsDetails getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/deletestudentbyid/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
    @PostMapping("/savestudentabv18")
    public StudentsDetails saveStudent(@RequestBody StudentsDetails student) {
        return studentService.saveStudent(student);
    }
}


