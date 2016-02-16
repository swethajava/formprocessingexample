<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="spring.mvc.Customer" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SUCESS PAGE</title>
</head>
<body>
<% Customer cust = (Customer)request.getAttribute("customer");
    out.println("Customer Id is : "+cust.getCid());
%>

</body>
</html>