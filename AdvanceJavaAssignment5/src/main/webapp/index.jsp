
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style>
header {
	background-color: #DCDCDC;
	border-top-style: solid;
	border-bottom-style: solid;
	border-width: 2px;
	height: 30px;
}

.form1 {
	background-color: #FFFAF0;
	width: 400px;
	font-size: 20px;
	margin: auto;
	margin-top: 100px;
	text-indent: 1em;
}

p {
	text-indent: 2em;
}

.login {
	display: inline-block;
	border-bottom-color: blue;
	padding-right: 20px;
	position: relative;
	bottom: -4px;
	right: -310px;
}

footer {
	position: relative;
	bottom: -10px;
	background-color: #DCDCDC;
	border-top-style: solid;
	border-bottom-style: solid;
	border-width: 1px;
	height: 30px;
}
</style>
</head>
<body style="background-image: url('https://media.glassdoor.com/banner/bh/240077/nagarro-banner-1481047370407.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-position: bottom">


	<form class="form1" action="/AdvanceJavaAssignment5/authenticaion" method="post">
		<header>HR Login System</header>
		<pre>
User Name   * <input type="text" name="userid"><br>  
  Password   * <input type="password" name="pass">
  
</pre>
		<footer>
			<input type="submit" class="login" value="Login">
		</footer>
	</form>

</body>
</html>