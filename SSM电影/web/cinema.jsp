<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<title>影院信息查询</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->


	</head>

	<body>
		<form action="findFilms" method="post">
			<table>
				<tr>
					<td>
						电影名称：
					</td>
					<td>
						<input name="filmname" type="text" />
					</td>
				</tr>
				<tr>
					<td>
						电影类型：
					</td>
					<td>
						
						<select id="typeid" name="typeid">
							<option value="0" selected="selected">
								全部
							</option>
							<!-- ${obj.propName}  obj.getPropName()  自省 -->
							<c:forEach var="filmType" items="${allFilmType}">
								<option value="${filmType.typeid}">
									${filmType.typename}
								</option>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td>
						主演：
					</td>
					<td>
						<input name="actor" type="text" />
					</td>
				</tr>
				<tr>
					<td>
						导演：
					</td>
					<td>
						<input name="director" type="text" />
					</td>
				</tr>
				<tr>
					<td>
						价格：
					</td>
					<td>
						<input name="smallprice" type="text" />
						至
						<input name="bigprice" type="text" />
					</td>
				</tr>
				<tr>
					<td>
						查询
					</td>
					<td>
						<input type="submit" value="提交查询" />
						<input type="button" value="发布电影"
							onclick="javascript:location='toAddFilm'" />
<%--						<input type="button" value="下架电影"--%>
<%--							   onclick="javascript:location='deleteFilms'" />--%>
					</td>
				</tr>

			</table>
		</form>
	</body>
</html>
