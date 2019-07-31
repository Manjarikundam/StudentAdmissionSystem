<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style type="text/css">
#an{
align:center;

}
td{
padding:10px;
border:none;
}
#f2{
width:400px;
height:450px;
background-color:lightgrey;
}

</style>
<script>
function ssc(){
	document.getElementById("id3").disabled=true;
	
}
function cbse(){
	document.getElementById("id3").disabled=false;
}

</script>
</head>
<body>

<CENTER><fieldset id="f2">
<h1>student application form</h1>
<form action="application" method="post">

<table>
<tr>
<td>Applicant_no:<input type="text" name="applicant_no"></td>
<td>name:<input type="text" name="name"></td>
</tr>

<tr>
ssc<input onclick="ssc()" type="radio" name="board" value="ssc">
cbse<input onclick="cbse()" type="radio" name="board" value="cbse">

<td>percentage:<input id="id4" type="text" name="percentage"></td>
</tr>

<tr>
<td>gpa:<input id="id3" type="text" name="gpa"></td>
<td>school_name:<input type="text" name="school_name"></td>
</tr>

<tr>
<td>dept_choice:<input type="text" name="dept_choice"></td>
</tr>

<tr>
<td></td>

<td><input type="submit" value="APPLY"></td> 
 </tr>

</table>


</form>
</center>
</fieldset>
</CENTER>
</body>
</html>