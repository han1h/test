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
	String v1 = "AAAA";
	//session.setAttribute("v1", v1);
	application.setAttribute("v1", v1);
%>
<%--
	EL : Expression Language(표현언어)
	request 또는 session, application에 저장된 속성들만 표현할 수 있다
 --%>

<h2>${date}:${ v1 }</h2>
</body>
</html>