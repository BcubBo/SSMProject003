<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body style="background-color:lightgrey">
<form action="register.html" method="post">
	<table>
		<tr>
			<td>用户名:</td>
			<td><input type="text" name="userName"/></td>
		</tr>
		<tr>
			<td>密码:</td>
			<td><input type="text" name="password"/></td>			
		</tr>
		<tr>
			<td>电话:</td>
			<td><input type="text" name="tel"/></td>
		</tr>
		<tr>
			<td>电子邮箱:</td>
			<td><input type="text" name="email"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="提交"/></td>
		</tr>
	</table>
</form>
</body>
</html>