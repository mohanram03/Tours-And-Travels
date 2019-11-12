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
  <link rel="stylesheet" href="login.css">
  <script defer src="https://use.fontawesome.com/releases/v5.0.9/js/all.js" integrity="sha384-8iPTk2s/jMVj81dnzb/iFR2sdA7u06vHJyyLlAd4snFpCl/SnyUjRrbdJsw1pGIl"
    crossorigin="anonymous"></script>
  <!--Let browser know website is optimized for mobile-->
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

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
              <a href="login.html">Login</a>
            </li>
             <li>
              <a href="register.html">Register</a>
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
  </ul>
<h1>Welcome To CTLI Travels</h1>
<form action="login" method="post">
<label>UserId:</label>
<input type="text" name="userID">
<label>Password:</label>
<input type="password" name="passWord">
<input type="submit" value="Login">
<a href="Register.jsp"><input type="button" value="Register"></a>
</form>
 <!-- Footer -->
  <footer class="section teal darken-2 white-text center">
    <p class="flow-text">CTLI Travels &copy; 2019 </p>
  </footer>
</body>
</html>