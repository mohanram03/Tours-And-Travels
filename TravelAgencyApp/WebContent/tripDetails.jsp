<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <!--Import Google Icon Font-->
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <!--Import materialize.css-->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/css/materialize.min.css">
  <link rel="stylesheet" href="css/main.css">
  <script defer src="https://use.fontawesome.com/releases/v5.0.9/js/all.js" integrity="sha384-8iPTk2s/jMVj81dnzb/iFR2sdA7u06vHJyyLlAd4snFpCl/SnyUjRrbdJsw1pGIl"
    crossorigin="anonymous"></script>
  <!--Let browser know website is optimized for mobile-->
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta charset="ISO-8859-1">
<title>Trip Details</title>
</head>
<body>
<body id="home" class="scrollspy">
  <!-- Navbar -->
  <div class="navbar-fixed">
    <nav class="teal">
      <div class="container">
        <div class="nav-wrapper">
          <a href="#" class="brand-logo">CTLI Travels</a>
          <a href="#" data-target="mobile-nav" class="sidenav-trigger">
            <i class="material-icons">menu</i>
          </a>
          <ul class="right hide-on-med-and-down">
            <li>
              <a href="#home">Home</a>
            </li>
            <li>
              <a href="#search">Search</a>
            </li>
            <li>
              <a href="#popular">Popular Places</a>
            </li>
            <li>
              <a href="#Book">Book</a>
            </li>
             <li>
              <a href="login.jsp">Login</a>
            </li>
             <li>
              <a href="register.jsp">Register</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  </div>
  <ul class="sidenav" id="mobile-nav">
    <li>
      <a href="#home">Home</a>
    </li>
    <li>
      <a href="#search">Search</a>
    </li>
    <li>
      <a href="#popular">Popular Places</a>
    </li>
    <li>
      <a href="#Book">Book</a>
    </li>
     <li>
      <a href="login.jsp">Login</a>
    </li>
     <li>
      <a href="Register.jsp">Register</a>
    </li>
  </ul>
<div>
<form action="register" name="form"  method="post">
<br><br>
<input type="text" name="tripId"  placeholder="trip Id">
<input type="text" name="tripName" id="tripName" placeholder="trip Name">
<input type="date" name="startDate" id="cost"  placeholder="Product Cost" >
<input type="date" name="endDate" id="cost"  placeholder="Product Cost">
<input type="text" name="placesCovered" id="placesCovered" placeholder="placesCovered">
<input type="number" name="price" id="price"  placeholder="price">
<input type="button" name='btn1' id='btn1' value='Check' onclick="validate(this.form)">
<input type="button" value="Add Item" onclick ="myFunction();"><br><br>
</form>
</div>
<p></p>
</body>
</html>