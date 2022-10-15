<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="<c:url value="/resources/css/style.css"></c:url>"></link>
    <script src="<c:url value="/resources/js/demo.js"></c:url>" ></script>
</head>
<body>
    <div class="container">
            <div class="main-card">
                <div class="main-card-body">
                    <h2>Complex Form</h2>
                    <div class="alert alert-danger" role="alert">
  						<form:errors path="student.*" />
							</div>
                    <form action="subComplex" method="post">
                        <div class="form-group">
                            <label>Your Name</label>
                            <input class="prop" name="stdName" type="text" placeholder="Enter your name" />
                        </div>
                        <div class="form-group">
                            <label >Your id</label>
                            <input class="prop" name="stdId" type="text" placeholder="Enter your id">
                        </div>
                        <div class="form-group">
                            <label >Your DOB</label>
                            <input class="prop" name="stdDate" type="date" placeholder="dd/mm/yyyy">
                        </div>

                        <div class="form-group">
                            <label>Select your courses</label>
                            <select name="subjects" class="courses" multiple>
                                <option value="Java">Java</option>
                                <option value="Python">Python</option>
                                <option value="C++">C++</option>
                                <option value="Ruby">Ruby</option>
                            </select>
                        </div>

                        <div class="radioin">
                            <label>Select Gender</label>
                            <input type="radio" value="Male" name="stdGender" />
                            <label>Male</label>
                            <input type="radio" value="Female" name="stdGender" />
                            <label>Female</label>
                        </div>

                        <div class="form-group">
                            <label>Select Type</label>
                            <select class="student-type" name="stdType">
                                <option value="Old">Old Student</option>
                                <option value="New">New Student</option>
                            </select>
                        </div>
                        
                        <div class="form-group">
                        	<label> Your Address</label>
                        	<label> Street</label>
                        	<input type="text" name="address.street" />
                        	<label>City</label>
                        	<input type="text" name="address.city" />
                        </div>
                       
                        <div class="btn">
                            <input type="submit" value="Submit" />
                        </div>
                    </form>
                </div>

            </div>

    </div>
</body>
</html>