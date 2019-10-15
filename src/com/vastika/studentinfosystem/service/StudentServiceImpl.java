package com.vastika.studentinfosystem.service;

import java.util.List;

import com.vastika.studentinfosystem.dao.StudentDao;
import com.vastika.studentinfosystem.dao.StudentDaoImpl;
import com.vastika.studentinfosystem.model.Student;

public class StudentServiceImpl implements StudentService {

	StudentDao studentDao = new StudentDaoImpl();

	@Override
	public void saveStudentInfo(Student student) {
		studentDao.saveStudentInfo(student);
	}

	@Override
	public List<Student> getAllStudentInfo() {
		return studentDao.getAllStudentInfo();
	}

}
