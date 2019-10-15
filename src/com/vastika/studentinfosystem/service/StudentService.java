package com.vastika.studentinfosystem.service;

import java.util.List;

import com.vastika.studentinfosystem.model.Student;

public interface StudentService {
	
	void saveStudentInfo(Student student);

	List<Student> getAllStudentInfo();

}
 