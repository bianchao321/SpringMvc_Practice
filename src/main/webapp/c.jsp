<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
	<legend>8种基本类型</legend>
		<form action="${pageContext.request.contextPath }/f1.do" method="post">
			b: <input type="text" name="b"  /> <br />
			s: <input type="text" name="s" /> <br />
			i: <input type="text" name="i" /> <br />
			l: <input type="text" name="l" /> <br />
			f: <input type="text" name="f" /> <br />
			d: <input type="text" name="d" /> <br />
			bb:<input type="text" name="bb" /> <br />
			c: <input type="text" name="c" /> <br />
			<button type="submit">GO</button>
		</form>
	</fieldset>


</body>
</html>