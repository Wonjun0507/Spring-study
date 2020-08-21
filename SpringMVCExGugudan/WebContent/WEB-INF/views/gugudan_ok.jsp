<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String data1 = (String)request.getParameter("data1");
	String data2 = (String)request.getParameter("data2");
	
	StringBuffer html = new StringBuffer();

	int idata1 = Integer.parseInt(data1);
	int idata2 = Integer.parseInt(data2);

	
	for (int i = idata1; i <= idata2; i++) {
		html.append("<table border='1' width='800'>");
		
		html.append("<tr>");
		for (int j = 1; j <= 9; j++) {
		html.append("<td>" + i + "x" + j + "=" + i * j + "<br></td>");
		}
		html.append("</tr>");
		
		html.append("</table>");
	}
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단</title>
</head>
<body>
<%=html %>
</body>
</html>