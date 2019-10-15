<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User List</title>
</head>
<body>
 <c:if test="${!empty users}">
 	<table>
 		<thead>
 			<tr>
		 		<th>S.N</th>
		 		<th>Id</th>
		 		<th>Username</th>
		 		<th>Password</th>
		 		<th>Email</th>
		 		<th>D</th>
 			</tr>
 		</thead>
 		<tbody>
 			<c:forEach items="${users }" var="u" varStatus="i">
 				<tr>
 					<td>${i.count}</td>
 					<td>${u.id }</td>
 					<td>${u.username }</td>
 					<td>${u.password }</td>
 					<td>${u.email }</td>
 					<td>${u.dob}</td>
 				</tr>	
 			</c:forEach>
 		</tbody>
 	
 	</table>
 
 </c:if>
</body>
</html>