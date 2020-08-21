<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model1.ZipcodeTO" %>
<%@ page import="java.util.ArrayList" %>

<%
	ArrayList<ZipcodeTO> lists 
		= (ArrayList<ZipcodeTO>)request.getAttribute("lists");
	StringBuffer html = new StringBuffer();
	
	if(	lists != null ) {
		html.append("<table border='1' width='800'>");
		for( ZipcodeTO to : lists ) {
			html.append("<tr>");
			html.append("<td>" + to.getZipcode() + "</td>" );
			html.append("<td>" + to.getSido() + "</td>" );
			html.append("<td>" + to.getGugun() + "</td>" );
			html.append("<td>" + to.getDong() + "</td>" );
			html.append("<td>" + to.getRi() + "</td>" );
			html.append("<td>" + to.getBunji() + "</td>" );
			html.append("</tr>");
		}
		html.append( "</table>");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload=function(){
		document.getElementById('btn').onclick =function(){
		//alert('test');
		if(document.frm.dong.value.trim().length < 2 ){
			alert( '동이름을 2자이상 입력하셔야합니다.');
			return false;
		}
		document.frm.submit();
		};
	};

</script>
</head>
<body>
<form action="./zipcode.do" method="post" name="frm">
동이름 <input type="text" name="dong" size="40" maxlength="4" placeholder="동이름입력"/>
<input type="button" id="btn" value="동이름 검색" />
</form>
<br /> <hr /><br />
<%=html %>
</body>
</html>