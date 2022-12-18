<%@page import="koneksi.KoneksiUser"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%KoneksiUser user = new KoneksiUser();
    String id = request.getParameter("id");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Edit</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body class="container">

<form method="POST" action="/UasMultiplatform2022/update">
<div class="card mt-5">
  <div class="card-body">
    <div class="form-floating mb-3">
  <input type="text" class="form-control" id="floatingInput" placeholder="name@example.com" name="user_id" value="<%out.print(user.getUser(id).get(0).getUser_id()); %>" >
  <label for="floatingInput">User ID</label>
</div>

<div class="form-floating mb-3">
  <input type="text" class="form-control" id="floatingPassword" placeholder="Password" name="nama" value="<%out.print(user.getUser(id).get(0).getNama()); %>">
  <label for="floatingPassword">Nama</label>
</div>

<div class="form-floating mb-3">
  <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com" name="email" value="<%out.print(user.getUser(id).get(0).getEmail()); %>">
  <label for="floatingInput">Email</label>
</div>

<div class="form-floating mb-3">
  <input type="text" class="form-control" id="floatingInput" placeholder="name@example.com" name="kota" value="<%out.print(user.getUser(id).get(0).getKota()); %>">
  <label for="floatingInput">Kota</label>
</div>

<button type="submit" class="btn btn-primary">Update</button>
  </div>
  
 
  
</form>



</body>
</html>