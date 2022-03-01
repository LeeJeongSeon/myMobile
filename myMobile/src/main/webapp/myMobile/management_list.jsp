<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %>
<%@ page import="my_mobile_member.MmmDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../include/jquery-3.6.0.min.js"></script>
</head>
<body>
	<%
	Map<String, Object> map=(Map<String, Object>)request.getAttribute("map");
	List<MmmDTO> list=(List<MmmDTO>)map.get("list");
	int count=(int)map.get("count");
	String result=(String)request.getAttribute("result");
	%>
	<h2><%=result %></h2>
	<table width="100%">
		<caption>등록된 회원수 : <%=count %>명</caption>
		<tr style="background-color: #ccffcc;">
			<th>이름</th>
			<th>아이디</th>
			<th>가입일자</th>
			<th>이메일</th>
			<th>전화번호</th>
			<th>주소지</th>
		</tr>
		<%for (MmmDTO dto:list) { %>
		<tr>
			<td><%=dto.getName() %></td>
			<td><%=dto.getUserid() %></td>
			<td><%=dto.getJoin_date() %></td>
			<td><%=dto.getEmail() %></td>
			<td><%=dto.getHp() %></td>
			<td><%=dto.getAddress() %></td>
		</tr>
		<%} %>
	</table>
</body>
</html>