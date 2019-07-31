<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="DAO.*" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%ArrayList<Applicationbean> arrayList =(ArrayList<Applicationbean>) session.getAttribute("arrayList"); 
int count =(int) request.getAttribute("count");
int i=0;
%>
		<br><br>
	<form >
		<table border="1" align="center">
		<thead>
		<tr>
		<th>applicant_no</th>
		<th>Name</th>
		<th>board</th>
		<th>percentage</th>
		<th>gpa</th>
		<th>school_name</th>
        <th>dept_choice
		</tr>
		</thead>
			<%
			for(Applicationbean app : arrayList )
			{
				out.println("<tr>");
				out.println("<td>"+app.getApplicant_no()+"</td>");
				out.println("<td>"+app.getName()+"</td>");
			out.println("<td>"+app.getBoard()+"</td>");
			out.println("<td>"+app.getPercentage()+"</td>");
			out.println("<td>"+app.getGpa()+"</td>");
			out.println("<td>"+app.getSchool_name()+"</td>");
			out.println("<td>"+app.getDept_choice()+"</td>");
				out.println("</tr>");
				if(i==count)
					break;
				i++;	
	}
			%>
		
		</table>
		</form>

</body>
</html>