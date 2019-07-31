<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<style type="text/css">
#an{
align:center;

}
td{
padding:10px;
border:none;
}
#f1{
width:300px;
height:250px;
background-color:grey;
border:none;
}
#f2{
width:400px;
height:600px;
background-color:lightgrey;
}
body{
background-color:#95BFC0;
}


</style>
</head>
<body>
<% if(session.isNew()){
session.setAttribute("status","new");

}
if(session.getAttribute("status").equals("wrong inputs")){
%><h1 color="red">wrong inputs<h1><%

}
%>
<CENTER><fieldset id="f2">
<h1>student admission</h1>
<form action="Controller" method="get">

<h2>admin login</h2>  
<center><fieldset id="f1" align="center">

<br> <br> <br> 


<table>
<tr>
<td>Name:</td>
<td><input type="text" name="name"></td>
</tr>

<tr>

<td>Password:</td>
<td><input type="password" name="password"><br>  </td>
</tr>

<tr>
<td></td>

<td><input type="submit" value="login"></td> 
 </tr>

</table>

</fieldset>
<h2>application form for student admission</h2>

<h2 id="an"><a  href="application.jsp">application for admission</a></h2>

</form>
</center>
</fieldset>
</CENTER>
</body>
</html>