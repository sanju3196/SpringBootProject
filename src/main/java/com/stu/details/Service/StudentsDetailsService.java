package com.stu.details.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.stu.details.DAO.StudentsDetailsDAO;
import com.stu.details.Entity.StudentsDetails;

@Service
public class StudentsDetailsService {
    @Autowired
	StudentsDetailsDAO studentDao;
    @Autowired
    RestTemplate restTemplate;


    public String createStudent(StudentsDetails student) {
        return studentDao.createStudent(student);
    }

    public List<StudentsDetails> getAllStudents() {
        return studentDao.getAllStudent();
    }

    public StudentsDetails getStudentById(Long id) {
        return studentDao.getStudentById(id);
    }

    public void deleteStudent(Long id) {
        studentDao.deleteStudent(id);
    }
    
    public StudentsDetails saveStudent(StudentsDetails student) {
        if (student.getAge() < 18) {
            throw new IllegalArgumentException("Age should be above 18");
        }

        return studentDao.saveStudent(student);
    }


    }



