<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 결과</title>
</head>
<body>
<p>회원정보 결과</p>
<% 
// String userid = (String) resquest.getAttribute("useridKey");
String userid = (String) request.getAttribute("resultid");
String password = (String) request.getAttribute("resultpassword");
String email = (String) request.getAttribute("resultemail");
String emailagree = (String) request.getAttribute("resultemailagree");
String interest = (String) request.getAttribute("resultinterest");
String phone = (String) request.getAttribute("resultphone");
String introduce = (String) request.getAttribute("resultintroduce");
%>
이름 :<%=userid %><br>
비밀번호 :<%=password %><br>
email : <%=email %><br>
emailagree : <%=emailagree %><br>
interest : <%=interest %><br>
phone : <%=phone %><br>
introduce : <%=introduce %><br>

<!--  회원탈퇴 정보수정   -->
        <a href="member_update.jsp"><input type="button" value="정보수정"></a>
       

</body>
</html>