<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
            
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Employee</title>
</head>
<body style="background-image: url('https://media.glassdoor.com/banner/bh/240077/nagarro-banner-1481047370407.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-position: bottom">
	<div>
		<hr><h5 align="center">Enter Employee Details</h5><hr>
	</div>
	
	<div>
		<form action="/AdvanceJavaAssignment5/add-employee" method="post">
			<table style="width: 500px;">
				<tr>
					<td>
						<lable for="empId">Employee Id</lable>
					</td>
					<td>
						<input type="text" name="empId">
					</td>
				</tr>
				
				<tr>
					<td>
						<lable for="empName">Employee Name</lable>
					</td>
					<td>
						<input type="text" name="empName">
					</td>
				</tr>
				
				<tr>
					<td>
						<lable for="empEmail">Employee Email</lable>
					</td>
					<td>
						<input type="email" name="empEmail">
					</td>
				</tr>
				
				<tr>
					<td>
						<lable for="empDOB">Employee DOB</lable>
					</td>
					<td>
						<input type="date" name="empDOB">
					</td>
				</tr>
				
				<tr>
					<td>
						<lable for="empLocation">Employee Location</lable>
					</td>
					<td>
						<input type="text" name="empLocation">
					</td>
				</tr>
				
			</table>
			<input type="button" value="Upload" style="background-color:#1de9b6;">
		</form>
	</div>
</body>
</html>