<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Update User Request Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<br>
<div class="row">
<div class="col-sm-6">
<s:form action="adminAction">
<s:textfield name="userId" label="userId" placeholder="User Id"></s:textfield>
<s:textfield name="managerId" label="managerId " placeholder="Manager Id"></s:textfield>
<s:textfield name="firstName" label="firstName" placeholder="firstName"></s:textfield>
<s:textfield name="lastName" label="lastName" placeholder="LastName"></s:textfield>
<s:textfield name="email" label="email" placeholder="email"></s:textfield>
<s:textfield name="password" label="password" placeholder="password"></s:textfield>
<s:textfield name="shortId" label="shortId" placeholder="short Id"></s:textfield>
<s:textfield name="mobileNumber" label="mobile" placeholder="mobile number"></s:textfield>
<s:textfield name="dateOfJoining" label="doj" placeholder="date-Of-Joining"></s:textfield>
<s:select name="isActive" list="{'choose','active','inactive'}"></s:select>
<s:submit name="submit" value="create"></s:submit>
<%-- add token to JSP to be used by Token interceptor --%>

</s:form>
</div>
</div>

</div>
</body>
</html>