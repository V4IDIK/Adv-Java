<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String uname=request.getParameter("uname");
String password=request.getParameter("pwd");
if(uname.equals("admin")&& password.equals("1234")){

	response.sendRedirect("welcome.jsp");

}
else{
	response.sendRedirect("index.html? Invalid ");

}

%>
</body>
</html>