<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../include/jquery-3.6.0.min.js"></script>
</head>
<body>
	<%
	String str=(String)request.getAttribute("result");
	if(str.indexOf("환영") != -1) {
		out.print(str);
	%>
	<script type="text/javascript">
	alert("<%=str %>");
	</script>
	<%
	}else if(str.indexOf("잘못") != -1) {
		out.print(str);
	}else if(str.indexOf("완료") != -1) {
	%>
	<script type="text/javascript">
	alert("<%=str %>");
	</script>
	<%
	}else if(str.indexOf("실패") != -1) {
	%>
	<script type="text/javascript">
	alert("<%=str %>");
	</script>
	<%
	}
	%>
</body>
</html>