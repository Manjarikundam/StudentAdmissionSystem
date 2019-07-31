<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="DAO.*" %>
    <%@ page import="java.util.*,DAO.selected_students" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%ArrayList<Applicationbean> arrayList =(ArrayList<Applicationbean>) session.getAttribute("arrayList"); %>

		<br><br>
	<form >
		<table border="1" align="center">
		<thead>
		<tr>
		<th>Name</th>
		<th>percentage</th>
		<th>board</th>
		<th>percentage</th>
		<th>gpa</th>
		<th>school name</th>
		<th>dept_choice</th>

		</tr>
		</thead>
		
			<%
			try{
			new selected_students().select();
			ArrayList<String> li=new Applicationbean().getlist();
			Iterator iter=li.iterator();
			
			int k=0;
			while(iter.hasNext()){
			
		%>
		<tr>
		<td><%out.println(iter.next());%></td>
		<td><%out.println(iter.next());%></td>
		<td><%out.println(iter.next());%></td>
		<td><%out.println(iter.next());%></td>
		<td><%out.println(iter.next());%></td>
		<td><%out.println(iter.next());%></td>
		<td><%out.println(iter.next());%></td>
		<tr>
		
		
		
		
		
		
		<%
		}}catch(Exception e){
		out.println(e);
			
			}
			
			%>
		
		</table>
		</form>

</body>
</html>