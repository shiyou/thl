<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Map,java.util.HashMap"%>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>publish article</title>
</head>
<body>
<% 
	Map<String, String> attr = new HashMap<String, String>();
	attr.put("rows", "0");
	attr.put("cols", "0");
%>
	<!-- 
	<form action="sample_posteddata.jsp" method="get">
			<p>
				<label for="editor1">Editor 1:</label>
				<textarea cols="80" id="editor1" name="editor1" rows="10"></textarea>
			</p>
			<p>
				<input type="submit" value="Submit" />
			</p>
	</form> -->
	<form action="addArticleAction">
		<p>标题：<input type="text" value="" id="title" name="title" size="100px"/></p>
		<ckeditor:editor textareaAttributes="<%=attr %>" basePath="../ckeditor/" editor="content" value="" />
		<p><input type="submit" value="Submit" /></p>
	</form>

<ckeditor:replace replace="editor1" basePath="../ckeditor/" />
</body>
</html>