<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>
<% %>
    <form action = "login_auth.do" method="post">
    아이디 : <input type = "text" name="userid" placeholder="아이디"><br>
  패스워드: <input type = "text" name="password" placeholder="비밀번호"><br>
     <input type="submit" value="로그인">
    <a href="member_register.jsp"><input type="button" value="회원가입"></a>
    </form>
    
</body>
</html>