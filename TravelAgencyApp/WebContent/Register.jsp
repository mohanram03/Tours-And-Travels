<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script> 
function validate()
{ 
 var firstName = document.form.firstName.value;
 var lastName = document.form.lastName.value;
 var userType = document.form.userType.value;
 var userID = document.form.userID.value; 
 var passWord = document.form.passWord.value;
 
 
 if (fullname==null || fullname=="")
 { 
 alert("Full Name can't be blank"); 
 return false; 
 }
 else if (email==null || email=="")
 { 
 alert("userType can't be blank"); 
 return false; 
 }
 else if (userID==null || userID=="")
 { 
 alert("UserID can't be blank"); 
 return false; 
 }
 else if(passWord.length<6)
 { 
 alert("Password must be at least 6 characters long."); 
 return false; 
 } 

 } 
</script> 
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
  <title>CTLI Travels</title>
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
<center><h2>Registration Page</h2></center>
<form action="register" name="form"  method="post" onsubmit="return validate()">


First Name: <input type="text" name="firstName" />

Last Name:<input type="text" name="lastName" />
UserType:<input type="text" name="userType" />
UserID:<input type="text" name="userID" />
Password:<input type="password" name="passWord" />
<%=(request.getAttribute("errMessage") == null) ? "": request.getAttribute("errMessage")%>
<input type="submit" value="Register"></input><input type="reset" value="Reset">
</form>
<br>
<!-- Footer -->
  <footer class="section teal darken-2 white-text center">
    <p class="flow-text">CTLI Travels &copy; 2019 </p>
  </footer>
 
</body>
</html>