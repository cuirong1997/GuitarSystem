<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Rock's Guitar Shop</title>
</head>
<body>
<p>匹配结果</p>
<c:forEach items="${guitarList}" var="guitar">
    <p>Type：${guitar.instrumentType}</p>
    <p>制造商：${guitar.guitarSpec.builder}</p>
    <p>吉他风格：${guitar.guitarSpec.style}</p>
    <p>吉他类型 ：${guitar.guitarSpec.type}</p>
    <p>吉他价格 ：${guitar.guitarSpec.price}</p>
    <p>后板 ：${guitar.guitarSpec.backWood}</p>
    <p>前板 ：${guitar.guitarSpec.topWood}</p>
    <p>------------END-----------------  </p>
</c:forEach>
</body>
</html>
