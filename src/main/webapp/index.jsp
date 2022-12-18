<%@page import="koneksi.KoneksiUser"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Management</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<body class="container">
	<table class="table mt-5">
		<thead>
			<tr>
				<th scope="col">User_id</th>
				<th scope="col">Nama</th>
				<th scope="col">Email</th>
				<th scope="col">Kota</th>
				<th scope="col"><a class="btn btn-primary" href="create">Tambah</a></th>
			</tr>
		</thead>
		<tbody>
			<%
			KoneksiUser user = new KoneksiUser();
			int jmlUser = user.getUser().size();
			for (int i = 0; i < jmlUser; i++) {
			%>
			<tr>
				<th scope="row"><%out.print(user.getUser().get(i).getUser_id()); %></th>
				<td><%out.print(user.getUser().get(i).getNama()); %></td>
				<td><%out.print(user.getUser().get(i).getEmail()); %></td>
				<td><%out.print(user.getUser().get(i).getKota()); %></td>
				<td><a class="badge bg-success" href="update?id=<%out.print(user.getUser().get(i).getUser_id()); %>">edit</a>
				<a  class="badge bg-danger" href="delete?id=<%out.print(user.getUser().get(i).getUser_id()); %>">delete</a></td>
			</tr>
			<%
			}
			%>

		</tbody>
	</table>
</body>
</html>