package com.vastika.studentinfosystem.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vastika.studentinfosystem.model.Student;
import com.vastika.studentinfosystem.util.DBUtil;

public class StudentDaoImpl implements StudentDao  {

	@Override
	public void saveStudentInfo(Student student) {
		
		String sql = "insert into student_tbl(username, password, email, dob) valuse (?,?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		try {
			// 2.Obtaining the Connection object using driver manager
			con = DBUtil.getConnection();

			// 3. Obtaining Prepared Statement object using Connection
			ps = con.prepareStatement(sql);
			ps.setString(1, student.getUsername());
			ps.setString(2, student.getPassword());
			ps.setString(3, student.getEmail());
			ps.setDate(4, new Date(student.getDob().getTime()));

			// 4. Execute the query
			ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			// 5.Close the Connection
			try {
				if(ps != null) {
				ps.close();
				con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	@Override
	public List<Student> getAllStudentInfo() {
		String sql = "select * from user_tbl";
		List<Student> studentList = new ArrayList<>();
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setUsername(rs.getString("username"));
				student.setPassword(rs.getString("password"));
				student.setEmail(rs.getString("email"));
				student.setDob(rs.getDate("dob"));
				studentList.add(student);

			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return studentList;
	}

}
