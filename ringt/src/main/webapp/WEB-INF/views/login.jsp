
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="tr">
<head>

    <meta charset="UTF-8">
<meta http-equiv="content-type" content="text/html; charset=utf-8">  
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
     <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;700&display=swap" rel="stylesheet">
   
    <link rel="stylesheet"  href="login.css">
    

<!-- jQuery -->
	<script type="type/javascript" src="js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script type="type/javascript" src="js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script type="type/javascript" src="js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script type="type/javascript" src="js/jquery.waypoints.min.js"></script>
	<!-- Main JS -->
	<script type="type/javascript" src="js/main.js"></script>
	<script type="type/javascript" src="js/jquery-3.5.1.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    
    <script>
$(document).ready(function(){
	$(".message a").click(function(){
		   $("form").animate({'height': "toggle", 'opacity': "toggle"}, "slow");
		});
  });
</script>

</head>


<body>
<p>sdşlfksdf</p>
<div class="login-page">
    <div class="form">
      <form class="register-form">
        <input type="text" placeholder="name"/>
        <input type="text" placeholder="surname"/>
        <input type="text" placeholder="username"/>
        <input type="password" placeholder="password"/>
        <input type="text" placeholder="email address"/>
      <p class="message">By clicking Sign Up, you agree to our <a href="#">privacy policy</a></p>
        <button>Sign up</button>
        <p class="message">Already registered? <a href="#">Log In</a></p>
      </form>
      <form class="login-form">
        <input type="text" placeholder="username"/>
        <input type="password" placeholder="password"/>
        <button>log In</button>
        <p class="message">Not registered? <a href="#">Create an account</a></p>
      </form>
    </div>
  </div>
  


</html>