<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<h1 style="color:red; text-align:center">Data Rendering</h1>
<b>name: ${name}</b> <br>
<b>Age: ${age}</b> <br>
<b>Address: ${addr}</b>--%>

<%-- <h1 style="color:red; text-align:center;">Reading array and Collection Values</h1>
<b>Nick Names:(Arrays)</b> <br>
<c:forEach var="name" items="${nicknames}">
     <br> ${name} </br>
</c:forEach>
 <hr>
<br> <br>
<b>Phone Numbers:: (Set)</b> <br>
<c:forEach var="phoneno" items="${mobilePhoneSet}">
     <br> ${phoneno} </br>
</c:forEach>
 <hr>
<br> <br>

<b>Courses:: (List)</b> <br>
<c:forEach var="course" items="${courseList}">
     <br> ${course} </br>
</c:forEach>

 <hr>
 
<br> <br>

<b>ID Cards:: (Map)</b> <br>
<c:forEach var="ids" items="${idMap}">
     <br> ${ids.key}======>${ids.value}</br>
</c:forEach>

 --%>
 
 
 <%-- <h1 style="color:red; text-align:center;">Reading Multiple Employee Data</h1>
 
 <table border="1" align="center">
   <tr>
       <th>eno</th> <th>ename</th>  <th>desg</th>  <th>Salary</th> 
   </tr>
 

 
 <c:forEach var="empdata" items="${empInfo}">
        <tr>
          <td>${empdata.eno}</td>
          <td>${empdata.ename}</td>
          <td>${empdata.desg}</td>
          <td>${empdata.salary}</td>
        </tr>
 </c:forEach>
  </table>
 
  --%>
  
  
  <h1 style="color:red; text-align:center;">Reading Single Employee Data</h1>
   <b>Employee No: ${empInfo.eno}</b>  <br><br>
  <b>Employee Name: ${empInfo.ename}</b><br><br>
  <b>Employee Designation: ${empInfo.desg}</b><br><br>
  <b>Employee Salary: ${empInfo.salary}</b><br><br>
  
  
 





