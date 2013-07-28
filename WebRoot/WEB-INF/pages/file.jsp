<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'file.jsp' starting page</title>
  </head>
  
  <body>
  ${test }
    <form action="file" method="post" enctype="multipart/form-data">
    		<input type="text" name="name"/> 
            <input type="file" name="file"/> 
            <input type="submit" value="upload"/>
    </form>
  </body>
</html>
