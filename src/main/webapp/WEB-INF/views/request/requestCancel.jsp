<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${result > 0 }">
		<script type="text/javascript">
			alert("신청을 취소하였습니다.")
			location.href = "${_board}/detail.do?b_no=${b_no}"; /*  b_no에 board.b_no  */
		</script>
	</c:if>

	<c:if test="${result == 0 }">
		<script type="text/javascript">
			alert("취소 실패")
			history.go(-1);
		</script>
	</c:if>
</body>
</html>