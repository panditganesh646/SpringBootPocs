<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     <h1 style="color:red; text-align:center;">Employee Registration Form</h1> 
   <form:form modelAttribute="emp">
        <table align="center" bgcolor="cyan">
           <tr>
           <td>Employee Number: </td><td> <form:input  path="eno"/></td>
           </tr>
           <tr>
           <td>Employee Name: </td><td> <form:input path="ename"/></td>
           </tr>
           <tr>
           <td>Employee Address: </td><td> <form:input path="eadd"/></td>
           </tr>
           <tr>
           <td>Employee Salary: </td><td> <form:input path="salary"/></td>
           </tr>
           <tr>
              <td colspan="2"> <input type="submit" value="register"></td>
           </tr>
        </table>
   </form:form>
</body>
</html>