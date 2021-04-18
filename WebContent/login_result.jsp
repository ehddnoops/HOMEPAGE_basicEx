<%@page import="edu.web.member.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 후 화면</title>
</head>
<body>
    <p>로그인 결과 페이지</p>
    <%
      String userid = (String) session.getAttribute("useridKey");
    %>
    
    <p><%=userid %>님 환영합니다</p>
        <a href="select.do?userid=<%=userid%>"><input type="button" value="회원정보보기"></a>
        
        <a href="logout.do?userid=<%=userid%>"><input type="button" value="로그아웃"></a>
    <!--  get 방식으로 아이디 전송
        - location.href=''
     -->

</body>
</html>