<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<h1>File Uploading to the Server</h1>
	<form action="uploadImage" method="post" enctype="multipart/form-data">
		<div class="form-group">
			<label>Upload your file</label>
			<input type="file" name="userFile" placeholder="choose your file" />
		</div>
		<button type="submit">Upload</button>
	</form>
	</div>
	
</body>
</html>