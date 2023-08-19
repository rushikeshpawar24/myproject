<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.sql.*"%>
<h1>BOOKED SUCCESSFULLY....</h1>

<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rentcar","root","root");
String query="select * from car";
Statement st=con.createStatement();

ResultSet rs=st.executeQuery(query);
%>
<table border="">
<tr>
<th>Name</th>
<th>City</th>
<th>Contact</th>
<th>Days</th>
<th>Destination</th>
</tr>

<% 
while(rs.next())
{%>
<tr>
 
	<td><%out.println(rs.getString(1));%></td>
	
	<td><%out.println(rs.getString(2));%></td>
	
	<td><%out.println(rs.getLong(3));%></td>
	
	<td><%out.println(rs.getString(4));%></td>
	
	<td><%out.println(rs.getString(5));
}
%></td>
</tr>
</table>
<a href="index1.html"><button>HOME PAGE</button></a>


</body>
</html>