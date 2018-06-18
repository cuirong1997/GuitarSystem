<%--
  Created by IntelliJ IDEA.
  User: 高龙天
  Date: 2018/6/12
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>展示页面</p>
<c:forEach items="${guitarList}" var="guitar">
    <p>吉他名字：${guitar.instrumentType}</p>
    <p>吉他颜色：${guitar.guitarSpec.builder}</p>
    <p>吉他弦数：${guitar.guitarSpec.style}</p>
    <p>吉他大小：${guitar.guitarSpec.type}</p>
    <p>---------------------------------------  </p>
</c:forEach>
</body>
</html>
