
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="style.css">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
    	
			.main-card{
			    width:500px;
			    height:700px;
			    margin:auto;
			    padding-top:13px;
			}
			.main-card-body{
			    font-size:16px;
			    height:544px;
			}
			h2{
			    text-align: center;
			    padding-top:7px;
			}
			label{
			    display:block;
			    margin:3px;
			}
			.form-group{
			    margin:5px;
			    padding:5px;
			}
			.prop{
			    border:none;
			    height:25px;
			    width:468px;
			    padding:5px;
			}
			.courses{
			    border:none;
			    height:77px;
			    width:478px;
			    padding:5px;
			}
			.student-type{
			    border:none;
			    height:25px;
			    width:478px;
			    padding:5px;
			}
			
			.radioin label{
			    display:inline;
			}
			.radioin{
			    margin-left:10px;
			}
			.btn{
			    text-align:center;
			    margin-top:16px;
			}
			.btn input{
			    border:none;
			    height:26px;
			    width:66px;
			    background-color:lightblue
			}
			.btn input:hover{
			    background-color:lightgray;
			}
    </style>
</head>
<body>
    <div class="container">
            <div class="main-card">
                <div class="main-card-body">
                    <h2>Complex Form</h2>
                    <form action="subComplex" method="post">
                        <div class="form-group">
                            <label>Your Name</label>
                            <input class="prop" name="stdName" type="text" placeholder="Enter your name" />
                        </div>
                        <div class="form-group">
                            <label >Your id</label>
                            <input class="prop" name="stdId" type="number" placeholder="Enter your id">
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
                        <div class="btn">
                            <input type="submit" value="Submit" />
                        </div>
                    </form>
                </div>

            </div>

    </div>
</body>
</html>