<%@page import="org.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table{
	border:2px solid green;
	border-collapse: collapse;
}
td{
	padding : 5px;
	border:2px solid green;
	border-collapse: collapse;
}
</style>
</head>

<body>
<center>
<h2>All Students</h2>
<%
		StudentDao dao = new StudentDao();
		ArrayList<Student> slist = dao.getAllStudents();
		if(slist!=null && slist.size()>0){
%>		
		<table>
			<tr>
				<td>Reg No</td>
				<td>Name</td>
				<td>CGPA</td>
				<td>Department</td>
			</tr>
		<%	
		for(Student s:slist){
			 %>	
			<tr>
				<td><%= s.getRegNo() %></td>
				<td><%= s.getName() %></td>
				<td><%= s.getCgpa() %></td>
				<td><%= s.getDept() %></td>
			</tr>
		<% } %>
		</table>
<%} else { %>
	<h2>Student Details Not Available</h2>
<%} %>
</center>
		
</body>
</html>