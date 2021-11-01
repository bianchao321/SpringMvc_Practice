<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/1
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>
</head>
<body>
<h3>g.jsp</h3>
    <form action="${pageContext.request.contextPath }/user/upload.do" method="post" enctype="multipart/form-data">
        photo:<input type="file" name="photo" /><br />
        <button type="submit">GO</button>
    </form>
<button id="btn">ajax go</button>
</body>
</html>
