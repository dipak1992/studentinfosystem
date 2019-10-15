package com.vastika.studentinfosystem.dao;

import java.util.List;

import com.vastika.studentinfosystem.model.Student;

public interface StudentDao {
	
	void saveStudentInfo(Student student);

	List<Student> getAllStudentInfo();

}
