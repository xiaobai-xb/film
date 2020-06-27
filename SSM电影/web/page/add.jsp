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
		<title>发布电影信息</title>
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
		<div >${message}</div>
		<form action="FilmAddServlet" method="post" enctype="multipart/form-data">
			<table>
				<tr>
					<td>
						电影名称：
					</td>
					<td>
						<input name="filmname" type="text" />
					</td>
					<td>
						<div id="fnmessage" style="display: none"></div>
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

							<c:forEach var="filmType" items="${requestScope.allFilmType}">
								<option value="${filmType.typeid}">
									${filmType.typename}
								</option>
							</c:forEach>
						</select>
					</td>
					<td>
						<div id="timessage" style="display: none"></div>
					</td>
				</tr>
				<tr>
					<td>
						主演：
					</td>
					<td>
						<input name="actor" type="text" />
						<span style="color: red">${actor}</span>
					</td>
				</tr>
				<tr>
					<td>
						导演：
					</td>
					<td>
						<input name="director" type="text" />
						<span style="color: red">${director}</span>
					</td>
				</tr>
				<tr>
					<td>
						图片：
					</td>
					<td>
						<input name="picname" type="file" />
					</td>
				</tr>
				<tr>
					<td>
						价格：
					</td>
					<td>
						<input name="ticketprice" type="text" />
					</td>
					<td>
						<div id="tpmessage" style="display: none"></div>
					</td>
				</tr>
				<tr>
					<td>
						发布
					</td>
					<td>
						<input value="发布" type="submit" />
						<input type="button" value="返回首页"
							onclick="javascript:location='index.jsp'" />
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>