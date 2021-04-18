<%@page import="edu.web.member.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
</head>
<body>
<%
String userid = (String) session.getAttribute("useridKey");
%>
      
    <form action="/Homepage/update.do" method="Post"> <!-- 그냥 /register.do를 했을때 404에러 상윗단으로 가야함(찾아야함)-->
        아이디 : <input type="text" name="userid" value="<%=userid %>" readonly="readonly"><br>
        패스워드: <input type="password" name="password"><br>
        이메일: <input type="email" name="email"><br>
        이메일 수신여부: <br>
        <input type="radio" name="emailAgree"  value="y">예
        <input type="radio" name="emailAgree"  value="n" checked="checked">아니요<br>
        관심사항:
     <input type="checkbox" name="interest" value="IT">IT/인터넷
     <input type="checkbox" name="interest" value="movie">영화
     <input type="checkbox" name="interest" value="music">음악
     <input type="checkbox" name="interest" value="book">책
     <input type="checkbox" name="interest" value="food">음식<br>
        핸드폰: <input type="text" name="phone"><br>
        자기소개: <textarea name="introduce" rows="20" cols="20"></textarea><br>
     <input type="submit" value="전송">
    </form> 
     <a href="/Homepage/delete.do?userid=<%=userid %>"><input type="button" value="회원탈퇴"></a>


</body>
</html>