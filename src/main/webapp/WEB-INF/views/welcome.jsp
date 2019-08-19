<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>output page</title>
</head>
<body>
<h1>OUTPUT:</h1>
<br>
the numbers you have entered are:
<br>
${nums}
<br>
the 2nd minimum is:${min}
<br>
<h1>REQUEST HISTORY</h1>
${his }
<br>
<form action="/find2min" >
<input type="submit" value="GET BACK"/>
</form>
</body>
</html>