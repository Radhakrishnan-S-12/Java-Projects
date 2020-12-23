package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<center>");
		out.println("<h1>welcome</h1>");
		String regNo = request.getParameter("regno");
		String sname = request.getParameter("name");
		String cgpa = request.getParameter("cgpa");
		String dept = request.getParameter("dept");
		out.println("<h2>"+regNo+"</h2>");
		out.println("<h2>"+sname+"</h2>");
		out.println("<h2>"+cgpa+"</h2>");
		out.println("<h2>"+dept+"</h2>");
		int iRegNo = Integer.parseInt(regNo);
		double dCgpa = Double.parseDouble(cgpa);
		Student s1 = new Student(iRegNo, sname, dCgpa, dept);
		StudentDao dao = new StudentDao();
		dao.addStudent(s1);
		out.println("</center>");
		out.println("<a href='home.html'>Home</a>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
