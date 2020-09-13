<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"
%>
<% 
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>사용자 등록</h2>
	<form method="post" action="register.do">
		member ID <input type="text" id="mem_id" name="mem_id" ><br/>
		member PW <input type="password" id="mem_pw" name="mem_pw" ><br/>
		<input type="submit" value="사용자 등록">
	</form>
</body>
</html>