<%@page import="org.Student"%>
<%@page import="org.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.content{
	margin: auto;
  	width: 100%;
  	text-align:center;
  	padding: 10px;
}

table td{
	padding : 10px;
	border : 2px solid green;
}
table{
	margin-left: auto;
	margin-right :auto;
	border-collapse:collapse;
}

</style>
<body>
<div class="content">
<h2>Student Information</h2>
<h3>Student Details</h3>
<%
		Student s = (Student) request.getAttribute("student");
		String status = (String) request.getAttribute("status");
		if(status !=null && status.equals("success") && s!=null){
%>		
<form name="f1" method="get" action="Controller">
<table>
	<tr><td>Enter Reg No.</td>
		<td><input type="text" name="regno" value='<%=s.getRegNo() %>' readonly="readonly"/></td></tr>
	<tr><td>Enter Name</td>
		<td><input type="text" name="name" value='<%=s.getName() %>'/></td></tr>
	<tr><td>Enter CGPA</td>
		<td><input type="text" name="cgpa" value='<%=s.getCgpa() %>'/></td></tr>
	<tr><td>Enter Dept</td>
		<td><input type="text" name="dept" value='<%=s.getDept() %>'/></td></tr>
	<tr><td colspan="2"><input type="submit" name = "action" value="Update Student"/>
			<input type="submit" name="action" value="Delete Student"/>
			<input type="reset" value="Reset"/></td></tr>
</table>
</form>
<%}%>
<br/>
<a href="Controller?action=home">Home</a>
</div>

</body>
</html>