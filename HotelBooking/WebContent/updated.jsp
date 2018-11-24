<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form"prefix="sf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Update Mobile Data
<table>
<sf:form action="updateaction" modelAttribute="mobile">
 <a href="index.jsp">Home</a>

<tr><td>Booking Id :<sf:input path="bookId"/>
<tr><td>Customer name :<sf:input path="name"/>
<tr><td>Customer address :<sf:input path="address"/>

<tr><td>Total Members:<sf:input path="members"/>

<tr><td><input type="submit" value="update"/>

</sf:form>
</table>
</body>
</html>