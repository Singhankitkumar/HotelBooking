<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib  prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List of All Booking</h1>
<table border="2">
<tr>
<th>Booking Id</th>
<th>Customer Name</th>
<th>Address</th>
<th>Total Members</th>

 <a href="index.jsp">Home</a>

</tr>
<a:forEach var="emp" items="${temp}" >
<tr>
<td>${emp.bookId}</td>
<td>${emp.name}</td>
<td>${emp.address}</td>
<td>${emp.members}</td>
</tr>
</a:forEach>
</body>
</html>