package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class StudentDao {
	public ArrayList<Student> getAllStudents() throws Exception{
		ArrayList<Student> studentsList = new ArrayList<Student>();
		Connection con = null;
		PreparedStatement pst = null;
		try{
		con = DBUtil.getMyDBConnection();
		pst = con.prepareStatement("select * from ugstudent");
		ResultSet rs = pst.executeQuery();
		while(rs.next()){
			Student s = new Student(rs.getInt(1), rs.getString(2),
								rs.getDouble(3),rs.getString(4));
			studentsList.add(s);
		}
		}catch(Exception e){
			throw e;
		}
		return studentsList;
	}
	public Student getStudent(int regno) throws Exception{
		Student s = null;
		Connection con = null;
		PreparedStatement pst = null;
		try{
		con = DBUtil.getMyDBConnection();
		pst = con.prepareStatement("select * from ugstudent where id=?");
		pst.setInt(1, regno);
		ResultSet rs = pst.executeQuery();
		if(rs.next()){
			s = new Student(rs.getInt(1), rs.getString(2),
								rs.getDouble(3),rs.getString(4));
		}
		}catch(Exception e){
			throw e;
		}
		if(s==null){
			throw new StudentNotFoundException();
		}
		return s;
	}
	
	public void deleteStudent(int regno) throws Exception{
		Connection con = null;
		PreparedStatement pst = null;
		try{
		con = DBUtil.getMyDBConnection();
		pst = con.prepareStatement("DELETE FROM ugstudent WHERE id=?");
		pst.setInt(1, regno);
		int result = pst.executeUpdate();
		if(result<=0)
			throw new StudentNotFoundException();
		}catch(Exception e){
			throw e;
		}
		
	}
	
	public void addStudent(Student st) throws Exception{
		Connection con = null;
		PreparedStatement pst = null;
		try{
		con = DBUtil.getMyDBConnection();
		pst = con.prepareStatement("INSERT INTO ugstudent VALUES(?,?,?,?)");
		pst.setInt(1, st.getRegNo());
		pst.setString(2, st.getName());
		pst.setDouble(3, st.getCgpa());
		pst.setString(4, st.getDept());
		pst.executeUpdate();
		}catch(Exception e){
			throw e;
		}
	}
	
	public void updateStudent(Student st) throws Exception{
		Connection con = null;
		PreparedStatement pst = null;
		try{
		con = DBUtil.getMyDBConnection();
		pst = con.prepareStatement("UPDATE ugstudent SET name = ?, cgpa = ?, dept =? WHERE id =?");
		pst.setString(1, st.getName());
		pst.setDouble(2, st.getCgpa());
		pst.setString(3, st.getDept());
		pst.setInt(4, st.getRegNo());		
		pst.executeUpdate();
		}catch(Exception e){
			throw e;
		}
	}
	
}
