<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Add User</h2>
<s:form action="addUserAction" >
  <s:textfield name="userName" label="UserName" value="" />
  <s:textarea name="password" label="Password" value="" cols="50" rows="5" />
    <s:textarea name="gender" label="gender" value="" cols="50" rows="5" />
  <s:submit />
</s:form>
</body>
</html>