<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     <h1 style="color:red; text-align:center;">Employee Registration Form</h1> 
   <form method="POST">
        <table align="center">
           <tr>
           <td>Employee Number: </td><td> <input type="text" name="eno"></td>
           </tr>
           <tr>
           <td>Employee Name: </td><td> <input type="text" name="ename"></td>
           </tr>
           <tr>
           <td>Employee Address: </td><td> <input type="text" name="eadd"></td>
           </tr>
           <tr>
           <td>Employee Salary: </td><td> <input type="text" name="salary"></td>
           </tr>
           <tr>
              <td colspan="2"> <input type="submit" value="register"></td>
           </tr>
        </table>
   
   </form>
     

</body>
</html>