package com.stu.details.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stu.details.Entity.StudentsDetails;
import com.stu.details.Exception.InvalidAgeException;
import com.stu.details.Repository.StudentsDetailsRepository;

@Repository
public class StudentsDetailsDAO {
	@Autowired
	StudentsDetailsRepository studentRep;

	public String createStudent(StudentsDetails student) {
		studentRep.save(student);
		return "saved student";
	}

	public List<StudentsDetails> getAllStudent() {
		return studentRep.findAll();

	}

	public StudentsDetails getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRep.findById(id).orElse(null);
	}

	public void deleteStudent(Long id) {
		// TODO Auto-generated method stub
		return;
	}

	public StudentsDetails saveStudent(StudentsDetails student) {
		try {
			return studentRep.save(student);
		} catch (IllegalArgumentException e) {
			throw new InvalidAgeException(e.getMessage());
		}
	}

}
