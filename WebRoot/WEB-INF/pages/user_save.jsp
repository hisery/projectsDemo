<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'user_save.jsp' starting page</title>
    
  </head>
  
  <body>
  	${sessionScope.aa }
    <form action="save" method="post">
    	Name: <input type="text" name="name" /><br/>
    	Password: <input type="text" name="password" /><br/>
    	ZipCode:  <input type="text" name="zipcode" /><br/>
    	<input type="submit" value="save"/>
    </form>
  </body>
</html>
