<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SpringMVC Demo首页</title>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<body>
<h1>这里是SpringMVC Demo首页</h1>
<h3>出现此页面，说明配置成功。</h3>
<form action="login" method="post">
	<table>
		<tr>
			<td><label for="txtname">账号：</label></td>
			<td><input type="text" id="txtname" name="username" /></td>
		</tr>
		<tr>
            <td><label for="txtpswd">密码：</label></td>
            <td><input type="password" id="txtpswd"  name="password" /></td>
        </tr>
        <tr>
            <td> 
            </td>
            <td>
            <input type="reset" value="重置">
            <input type="submit" value="登录"/>
            </td>
        </tr>
	</table>
</form>

</body>
</html>