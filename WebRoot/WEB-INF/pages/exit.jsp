<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>退出</title>
<script type="text/javascript" >
	function exitCountDown(){
	
		window.location.href="${pageContext.getRequest().getContextPath()}/index.jsp";
		
	}
	var i = 3;
	function count(){
		document.getElementById("countDown").innerHTML = i;
		i--;
	}
	var interval = setInterval(count,1000);
	window.onload = setTimeout(exitCountDown,3000);
</script>
</head>
<body style="background-color:lightgrey">
<span>您已退出！<span id="countDown"></span>秒后返回索引页面</span>
</body>
</html>