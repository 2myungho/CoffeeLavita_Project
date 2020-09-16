<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Master page</title>
<style>
	*{padding:0; margin:0;}
	a{text-decoration: none;}
	ul,ol{list-style: none;}
	h1{text-align: center; padding:20px 0;}
	tr:nth-of-type(1){height:40px;}
	tr:nth-of-type(even){background:#f2f2f2;}
	table{border-spacing: 0;}
	td{padding:5px 0 5px 20px;}
	.back{
		display: block;
		width:200px;
		height: 50px;
		margin:30px auto 0;
		border: 2px solid #d9d9d9;
	}
	.back a{display: block; width:100%; line-height:50px;color:#666; font-weight: bold;}
</style>
</head>
<body>
	<div id="root">
		<header>
			<h1>마스터 페이지</h1>
		</header>
		<hr />
						
		<section id="container">
			<form role="form" method="post" action="mastert">
				<table style="width:60%; margin:0 auto;">
					<colgroup>
						<col style="width: 33%;">
						<col style="width: 33%;">
						<col style="width: 33%;">
					</colgroup>
						<tr class="tableHead"><th>Name</th><th>ID</th><th>Password</th>
										
						<c:forEach items="${master}" var = "master">
							<tr class="bottom-line">
								<td><c:out value="${master.name}" /></td>
								<td><c:out value="${master.mem_id}" /></td>
								<td class="left"><c:out value="${master.mem_pw}" /></td>									
							</tr>
						</c:forEach>
										
					</table>
				</form>
			</section>
			<hr />
			<button class="back"><a href="#" onclick="history.go(-1)"> 뒤로가기 </a></button>
		</div>
</body>
</html>