<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="kr">

<head>
<!-- Common Header -->
<%@include file="common/header.jsp"%>

<title>SB Admin - Forgot Password</title>

</head>

<body class="bg-dark">

	<div class="container">
		<div class="card card-login mx-auto mt-5">
			<div class="card-header">비밀번호 찾기</div>
			<div class="card-body">
				<div class="text-center mb-4">
					<h4>비밀번호를 잊어버리셨나요?</h4>
					<p>비밀번호 찾으시려면 본인의 이메일(아이디)를 입력하시기 바랍니다.</p>
				</div>
				<form action="/forgot" method="post">
					<div class="form-group">
						<div class="form-label-group">
							<input type="email" id="inputEmail" name="email" class="form-control" placeholder="이메일 주소(아이디)" required="required" autofocus="autofocus"> <label for="inputEmail">이메일 주소(아이디)</label>
						</div>
					</div>
					<a class="btn btn-primary btn-block text-white" id="ResetBtn">인증 번호 전송</a>
				</form>
				<div class="text-center">
					<a class="d-block small mt-3" href="/regist">회원등록</a> <a class="d-block small" href="/login">로그인</a>
				</div>
			</div>
		</div>
	</div>
	<!-- Common Script -->
	<%@include file="common/script.jsp"%>

</body>

</html>