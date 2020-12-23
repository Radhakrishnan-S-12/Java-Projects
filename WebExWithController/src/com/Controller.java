package com;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = null;
		String status = null;
		String message = null;
		action = request.getParameter("action");
		System.out.println(action);
		if(action == null){
			response.sendRedirect("home.html");
		}else if(action.equals("addform")){
			request.getRequestDispatcher("addform.html").forward(request, response);
		}else if(action.equals("home")){
			request.getRequestDispatcher("home.html").forward(request, response);			
		}else if(action.equals("searchform")){
			request.getRequestDispatcher("search.html").forward(request, response);
		}else if(action.equals("Add Student")){
			String regNo = request.getParameter("regno");
			String sname = request.getParameter("name");
			String cgpa = request.getParameter("cgpa");
			String dept = request.getParameter("dept");
			if(regNo!=null && !regNo.trim().equals("") && 
					sname!=null && !sname.trim().equals("") && 
					cgpa !=null && !cgpa.trim().equals("") && 
					dept!=null && !dept.trim().equals("")){
				int iRegNo = Integer.parseInt(regNo);
				double dCgpa = Double.parseDouble(cgpa);
				Student s1 = new Student(iRegNo, sname, dCgpa, dept);
				try{
				StudentDao dao = new StudentDao();
				dao.addStudent(s1);
				status = "success";
				message = "Student Details Added Successfully...";
				}catch(Exception e){
					status="error";
					message = "Error : "+e;
				}
			}else {
				status = "error";
				message = "Check Your Input Values...";
			}
			request.setAttribute("status", status);
			request.setAttribute("message", message);
			request.getRequestDispatcher("success.jsp").forward(request, response);
		}else if(action.equals("Delete Student")){
			String tmp = request.getParameter("regno");
			if(tmp!=null && !tmp.trim().equals("")){
				StudentDao dao = new StudentDao();
				try{
				int regNo = Integer.parseInt(tmp);
				dao.deleteStudent(regNo);
				status="success";
				message = "Student Details Deleted Successfully...";
				}catch(Exception e){
					status="error";
					message = "Error : "+e;
				}
			}else{
				status = "error";
				message = "Check Your Input Values...";
			}
			request.setAttribute("status", status);
			request.setAttribute("message", message);
			request.getRequestDispatcher("success.jsp").forward(request, response);
		}else if(action.equals("Search Student")){
			String tmp = request.getParameter("regno");
			System.out.println(tmp);
			RequestDispatcher rd=null;
			if(tmp!=null && !tmp.trim().equals("")){
				StudentDao dao = new StudentDao();
				try{
				int regNo = Integer.parseInt(tmp);
				System.out.println(tmp+regNo);
				Student s = dao.getStudent(regNo);
				status="success";
				request.setAttribute("student", s);
				rd= request.getRequestDispatcher("displaystudent.jsp");
				}catch(Exception e){
					status="error";
					message = "Error : "+e;
					rd= request.getRequestDispatcher("success.jsp");
				}
			}else{
				status = "error";
				message = "Check Your Input Values...";
				rd= request.getRequestDispatcher("success.jsp");
			}
			request.setAttribute("status", status);
			request.setAttribute("message", message);
			rd.forward(request, response);
			
		}else if(action.equals("Update Student")){
			String regNo = request.getParameter("regno");
			String sname = request.getParameter("name");
			String cgpa = request.getParameter("cgpa");
			String dept = request.getParameter("dept");
			if(regNo!=null && !regNo.trim().equals("") && 
					sname!=null && !sname.trim().equals("") && 
					cgpa !=null && !cgpa.trim().equals("") && 
					dept!=null && !dept.trim().equals("")){
				int iRegNo = Integer.parseInt(regNo);
				double dCgpa = Double.parseDouble(cgpa);
				Student s1 = new Student(iRegNo, sname, dCgpa, dept);
				StudentDao dao = new StudentDao();
				try{
				dao.updateStudent(s1);
				status = "success";
				message = "Student Details Updated Successfully...";
				}catch(Exception e){
					status="error";
					message = "Error : "+e;
				}
			}else {
				status = "error";
				message = "Check Your Input Values...";
			}
			request.setAttribute("status", status);
			request.setAttribute("message", message);
			request.getRequestDispatcher("success.jsp").forward(request, response);
		}else if(action.equals("displayall")){
			StudentDao dao = new StudentDao();
			try{
			ArrayList<Student> slist = dao.getAllStudents();
			status = "success";
			request.setAttribute("studentslist", slist);
			}catch(Exception e){
				status="error";
				message = "Error : "+e;
			}
			request.getRequestDispatcher("displayall.jsp").forward(request, response);
		}
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
