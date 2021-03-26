
<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.nagarro.management.model.Employee,java.util.List"%>
	
<%@page isELIgnored="false"%>
		
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<STYLE >

input[type=submit] {
  
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}
h2{
margin-left: 150px;
}
</STYLE>
<title>Flights</title>
</head>
<body style="background-image: url('https://media.glassdoor.com/banner/bh/240077/nagarro-banner-1481047370407.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-position: bottom">
	<hr><h3>List of Employees</h3><hr>
	<div class="form-popup" align="center">
		<table class="form-container" border="1">
			<thead>
				<th>Id</th>
				<th>Name</th>
				<th>Location</th>
				<th>DOB</th>
				<th>Email</th>
			</thead>
			<tbody>

				<%
					List<Employee> lemp = (List<Employee>) request.getAttribute("mmm");

					int i = 0;
					try {
						if (!lemp.isEmpty()) {
							for (Employee emp : lemp) {
								i++;
				%>
				<tr>
					<td><%=emp.getEmpId()%></td>
					<td><%=emp.getEmpName()%></td>
					<td><%=emp.getEmpLocation() %>
					<td><%=emp.getEmpDOB()%></td>
					<td><%=emp.getEmpEmail()%></td>
				</tr>
				<%
					}
						}
						else{
							%>
							<h1> No Employee Available</h1>
							<%
						}
					} catch (Exception e) {
					}
				%>
			
		</table>
	</div>
</body>
</html>
