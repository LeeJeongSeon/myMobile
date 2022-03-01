<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../include/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btnKeyCheck").click(function(){
			list();
		});
	});
	
	function list() {
		$.ajax({
			type: "post",
			url: "/jsp02/my_mobile_member_servlet/list.do",
			data: "keyNum="+$("#keyNum").val(),
			success: function (result){
				console.log(result);
				$("#memberList").html(result);
			}
		});
	}
</script>
</head>
<body>
	<h2>관리자 키 번호를 입력해주세요</h2>
	<input type="password" id="keyNum"> <br>
	<button id="btnKeyCheck">확인</button>
	<div id="memberList"></div>
</body>
</html>