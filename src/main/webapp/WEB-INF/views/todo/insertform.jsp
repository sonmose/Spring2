<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/member/insertform.jsp</title>
</head>
<body>
<div class="container">
 	<h1>일정양식</h1>
 	<form action="insert.do" method="post">
 	<div>
 		<lable for="name">할일</lable>
 		<input type="text" name="content" id="content"/>	
 	</div>
 	 <div>
         <label for="addr">날짜</label>
         <input type="text" name="sysdate" id="sysdate"/>
      </div>
      <button type="submit">추가</button>
 	
 	</form>
 	</div>
</body>
</html>