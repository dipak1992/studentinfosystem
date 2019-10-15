package com.vastika.studentinfosystem.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vastika.studentinfosystem.model.Student;
import com.vastika.studentinfosystem.service.StudentService;
import com.vastika.studentinfosystem.service.StudentServiceImpl;


@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	StudentService studentService = new StudentServiceImpl();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("StudentList.jsp");
		request.setAttribute("students", studentService.getAllStudentInfo());
		rd.forward(request, response);
   
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// we are getting data from jsp(view)
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		String email = request.getParameter("email");
		String dob = request.getParameter("dob");
		
		// we are binding data to student model
		Student student = new Student();
		student.setUsername(username);
		student.setPassword(password);
		student.setEmail(email);

		// we are converting string date to Date class
		SimpleDateFormat sf = new SimpleDateFormat("MM/dd/yyyy");
		try {
			Date d = sf.parse(dob);
			student.setDob(d);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// we are sending data to service
		studentService.saveStudentInfo(student);

		
		RequestDispatcher rd = request.getRequestDispatcher("StudentList.jsp");
		request.setAttribute("students", studentService.getAllStudentInfo());
		rd.forward(request, response);

	}

}
