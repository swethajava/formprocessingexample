<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://www.springframework.org/tags/form"  prefix = "sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>NEW Customer</title>
</head>
<body>
<sf:form method="POST" modelAttribute="customer">
<fieldset>
<table cellspacing="0">
<tr>
<th><label for="user_full_name">Full Name :</label></th>
<td><sf:input path="cname" size="15" id="user_full_name"/>
<font color="red"><sf:errors path="cname" delimiter=","></sf:errors></font>
</td>
</tr>

<tr>
<th><label for="user_email">Email:</label></th>
<td><sf:input path="email" size = "50" id = "user_email"/>
<font color="red"><sf:errors path="email"></sf:errors></font>
</td>
</tr>

<tr>
<th><label for="user_mobile">Mobile:</label></th>
<td><sf:input path="mobile" size="50" id="user_mobile"/>
<font color="red"><sf:errors path="mobile"></sf:errors></font>
</td>
</tr>
<tr>
<th></th>
<td><input type="submit" value="submit"></td>
</tr>

</table>
</fieldset>
</sf:form>
</body>
</html>