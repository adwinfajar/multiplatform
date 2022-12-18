<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Input</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body class="container">

<form method="POST" action="/UasMultiplatform2022/create">
<div class="card mt-5">
  <div class="card-body">
    <div class="form-floating mb-3">
  <input type="text" class="form-control" id="floatingInput" placeholder="name@example.com" name="user_id">
  <label for="floatingInput">User ID</label>
</div>

<div class="form-floating mb-3">
  <input type="text" class="form-control" id="floatingPassword" placeholder="Password" name="nama">
  <label for="floatingPassword">Nama</label>
</div>

<div class="form-floating mb-3">
  <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com" name="email">
  <label for="floatingInput">Email</label>
</div>

<div class="form-floating mb-3">
  <input type="text" class="form-control" id="floatingInput" placeholder="name@example.com" name="kota">
  <label for="floatingInput">Kota</label>
</div>

<button type="submit" class="btn btn-primary">Submit</button>
  </div>
  
 
  
</form>



</body>
</html>