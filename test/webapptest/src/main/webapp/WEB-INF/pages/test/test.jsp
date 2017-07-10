<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>

<html>
<body>
	<form action="/webapptest/test" method="post">
		<input type="text" id="paramNum1" name="paramNum1" value="${numer1}"> 
		<input type="text" id="paramNum2" name="paramNum2" value="${numer2}"> 
		<input type="submit" value="Enviar">
	</form>
	<br>
	${sumResult}
</body>
</html>