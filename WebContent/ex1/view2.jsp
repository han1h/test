<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	h3{
		color: #00f;
	}
</style>
</head>
<body>
<%
	//MVC환경은 뷰 페이지로 이동시 forward되므로 request에 저장한 값들을 사용할 수 있다.
	
	Object obj = request.getAttribute("msg");

	String msg = null;
	
	//obj가 null이 아닐때 String으로 형변환 시킨다
	if(obj!=null)
		msg = (String)obj;
	
%>

<h3><%= msg %></h3>
</body>
</html>