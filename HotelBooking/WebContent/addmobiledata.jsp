<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="for" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<for:form method="post" action="insertbook" modelAttribute="my" >
<table>
<%-- <tr>
<td>Employee Id</td>
<td><for:input path="empId"/></td>
</tr> --%>

<tr>
<td> Customer name</td>
<td><for:input path="name"/></td>
<td><for:errors path="name"></for:errors></td>
</tr>

<tr>
<td>Customer Address</td>
<td><for:input path="address"/></td>
<td><for:errors path="address"></for:errors>
</tr>

<tr>
<td>Total Members</td>
<td><for:input path="members"/></td>
</tr>


<tr>
<td><input type="submit" value="Add Booking"></input></td>
</tr>
</table>

</for:form>
</body>
</html>