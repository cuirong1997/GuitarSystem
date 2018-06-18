<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Rock's Guitar Shop</title>
</head>
<body>
<p>按条件查询吉他</p>
<form action="show" method="post">
    <p>Builder：</p>
    <input type="text" name="builder" value="builder">
    <br>
    <p>Style：</p>
    <input type="text" name="style" value="style">
    <p>Type：</p>
    <input type="text" name="type" value="type">
    <p></p>
    <input type="submit" value="提交查询">
</form>
</body>
</html>
