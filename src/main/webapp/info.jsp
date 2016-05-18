<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
	<c:forEach items="${Users}" var="u">
		<tr>
			<td align="center">
			   <c:out value="${u.username}" />
		    </td>
	</c:forEach>

</div>
<br>
共${Total}页&nbsp;&nbsp;&nbsp; 
					<c:if test="${page.pageNo>1}">
						<a href="info?pageNo=${page.pageNo-1 }">上一页</a>
					</c:if>
					&nbsp;&nbsp;&nbsp; 
					<a href="info?pageNo=${page.pageNo+1}">下一页</a>
				去第<input type="text" name="pageNo" id="pageNo">页
				<input type="button" id="button1" onClick="buttonClick()" value="GO"/>
</body>
</html>