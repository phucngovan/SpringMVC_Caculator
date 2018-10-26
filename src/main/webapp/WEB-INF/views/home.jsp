<%--
  Created by IntelliJ IDEA.
  User: Win10
  Date: 26/10/2018
  Time: 9:38 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>home</title>
</head>
<body>
<h2>Cuculator</h2>
<form action="phuc" method="post">
    <input type="text" name="firstnumberr" value="">
    <select name="opera">
        <option value="addition">+</option>
        <option value="subtraction">-</option>
        <option value="multiptication">*</option>
        <option value="division">/</option>
    </select>
    <input type="text" name="secondnumber" value="">
    <%--<input type="submit" name="addition" value="Addition (+)">--%>
    <%--<input type="submit" name="subtraction" value="Subtraction (-)">--%>
    <%--<input type="submit" name="multiptication" value="Multiptication (X)">--%>
    <%--<input type="submit" name="division" value="Division (/)">--%>
    <input type="submit" value="submit">

    <h4> Result:${kq}</h4>

</form>
</body>
</html>
