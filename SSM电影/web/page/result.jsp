<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>电影信息</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<script>
			function deleteFilm() {
				console.log("1111");
				//获取表单，提交
				document.getElementById("deleteForm").submit();
			}
		</script>
	</head>

	<body>
	<form action="${ctx}/deleteFilms" id="deleteForm">
		<table border="1" bordercolor="#66CCCC" align="center" width="60%">
			<tr align="center">
				<td></td>
				<td>
					电影名称
				</td>
				<td>
					类型
				</td>
				<td>
					主演
				</td>
				<td>
					导演
				</td>
				<td>
					票价
				</td>
			</tr>
			<c:choose>
				<c:when test="${empty requestScope.result}">
					<tr>
						<td colspan="5">
							<c:out value="未找到符合条件的电影" />
						</td>
					</tr>
				</c:when>
				<c:when test="${!empty requestScope.result}">
					<c:forEach items="${requestScope.result}" var="film">
						<tr>
							<td>
								<input type="checkbox" name="filmIds" value="${film.filmid}"/>
							</td>
							<td>
								${film.filmname}
							</td>
							<td>
								${film.filmtype.typename}
							</td>
							<td>
								${film.actor}
							</td>
							<td>
								${film.director}
							</td>
							<td>
								${film.ticketprice}
							</td>
						</tr>
					</c:forEach>
				</c:when>
			</c:choose>
		</table>
		<p align="center">
			<input type="button" onclick="deleteFilm()" value="批量删除"
			style="background-color: aqua">
		</p>
	</form>
		<p align="center">
			<a href="toCinema" style="text-decoration: none">返回首页</a>
		</p>
	</body>
</html>
