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
</style>
</head>

<body>
<div class="content">
<h2>Student Information System</h2>
<h3>Action Status </h3>
<%
	String status = (String) request.getAttribute("status");
	String message = (String) request.getAttribute("message");
	if(status!=null && status.equals("success")){
%>
		<h2 style="text-color:green"><%=message %></h2>
<% } else { %>

		<h2 style="text-color:red"><%=message %></h2>
<%} %>
<a href="Controller?action=home">Home</a>
</div>
</body>
</html>
