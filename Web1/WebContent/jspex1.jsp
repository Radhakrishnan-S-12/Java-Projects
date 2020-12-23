<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>JSP Example</h1>
<%= "welcome" %>

<%
	String s1 = "SASTRA";
	out.println(s1);
%>
<% for(int i=0;i<10;i++) { %>
<%= "<h2>"+s1+"</h2>" %>

<%} %>

<%
	int x=100, y=20;
	if(x>y) {
%>
	<h2>X is Greater</h2>
<% } else { %>
	<h2>Y is Greater</h2>
<%} %>	
	

</body>
</html>