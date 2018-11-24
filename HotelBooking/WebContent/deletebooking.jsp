<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DELETE BOOKING PAGE</title>
</head>

<body>
	<form action="del_Trainee">
		<table>
			<tr>
				<td>Booking Id</td>
				<td><input type="text" name="bookId" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Delete Booking" /></td>
			</tr>
		</table>

	</form>
	</body>
	</html>
