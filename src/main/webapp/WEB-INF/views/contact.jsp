<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page isELIgnored="false" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
  </head>
 <body>
 	<h1>${channel}</h1>
 	<h1>${rating}</h1>
 	<div class="container">
>     	<form action="processForm" method="post">
>     		<div class="mb-3">
- 		    <label for="userEmail" class="form-label">Email address</label>
- 		    <input type="email" class="form-control" id="userEmail" name="userEmail" aria-describedby="emailHelp">
- 		    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
- 		  	</div>
- 		  	
- 		  	<div class="mb-3">
- 		    <label for="userName" class="form-label">UserName</label>
- 		    <input type="text" class="form-control" id="userName" name="userName" aria-describedby="emailHelp">
- 		    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
- 		  	</div>
- 		  	
- 		  	<div class="mb-3">
- 		    <label for="userPassword" class="form-label">Password</label>
- 		    <input type="password" class="form-control" id="userPassword" name="userPassword" aria-describedby="emailHelp">
- 		    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
- 		  	</div>
-     		<button type="Submit">Register</button>
-     	</form>
-     	</div>
 </body>
 </html>