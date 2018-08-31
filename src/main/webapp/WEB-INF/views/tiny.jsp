<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/sketchy/bootstrap.min.css" />
<link rel="stylesheet" href="/style.css" />

</head>
<body>
	<p> Tiny result set from <a href="https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json">this link!</a></p><a href="/complete" class = "btn btn-secondary"> To Complete result set</a>

	<table class="table">
		<thead>
			<tr>
				<strong><th>Name</th><th>Invented</th><th>Year</th></strong>
			</tr>
		</thead>
	<tbody>
		<c:forEach var="user" items="${tinyresult}">
			<tr>
				<td >${user.name}</td>
				<td >${user.invented}</td>
				<td >${user.year}</td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
<a href="/complete" class = "btn btn-secondary">To Complete result set</a>
	
</body>
</html>