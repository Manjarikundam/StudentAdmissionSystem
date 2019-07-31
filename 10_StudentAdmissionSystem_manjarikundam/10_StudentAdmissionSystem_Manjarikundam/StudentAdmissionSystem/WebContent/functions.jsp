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
</head>
<body>
<CENTER><fieldset id="f2">
<h1>admin functionalities</h1>
<form action="admin" method="get">


<h2 id="an"><a  href="admin?varname=applicant_review">applications review and allot department</a></h2>

<h2 id="an"><a  href="admin?varname=selected_students">selected studentslist of their choice</a></h2>
<h2 id="an"><a  href="admin?varname=top10">top10% of application table</a></h2>
<h2 id="an"><a  href="admin?varname=stud_ofgiven_dept">list of students for given department</a></h2>
<h2 id="an"><a  href="admin?varname=confirm">confirmation page</a></h2>

</form>
</center>
</fieldset>
</CENTER>
</body>
</html>