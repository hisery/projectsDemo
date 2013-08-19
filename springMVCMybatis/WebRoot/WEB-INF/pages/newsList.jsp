<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
  </head>
  
  <body>
  	<table border="1" bordercolor="#ccc">
  		<thead>
  			<tr>
  				<th>序号</th><th>标题</th><th>作者</th><th>发表时间</th><th>操作</th>
  			</tr>
  		</thead>
  		<tbody>
  			<c:forEach items="${newsList}" var="news">
  			<tr>
  				<td>${news.id}</td><td>${news.title}</td><td>${news.addTime}</td><td>${news.userId}</td><td>删除</td>
  			</tr>
			</c:forEach>
  		</tbody>
  	</table>
	
  </body>
</html>
