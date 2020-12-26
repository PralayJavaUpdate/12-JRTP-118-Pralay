<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
 <script type="text/javascript">
 
 </script>
  
<style type="text/css">
	.bg{
		background-color: #7CFC00;
		border-radius: 20px;
		text-align: justify;
	}
	
	.width{
		width:100%	
	}
	
	.container1{
		position: relative;
		
	}
	fieldset{
		position: absolute;
		left: 50%;
		top:50%;
		transform: translate(-50%,-50%);
		
		width: 50%;
		height: 50%;
	}
	
	.btn1 {
	margin-top: 20px;
}

.btnd{
	margin-top: 20px;
}
	
</style>

</head>
<body class="container-fluid">
	<fieldset>
		<legend><h1 class="text-center text-primary">Save Contact</h1></legend>
			<div class="row text-center bg" id="show">
			
				${succMsg} 
				${errMsg}
			</div>
			<div class="form-group">
				<form:form action="saveContact?contactId=${contact.contactId}" method="POST" modelAttribute="contact">
		<div class="container1">		
			<div class="row">
					<form:hidden path="contactId"/>
					<label class="font-weight-bold">Contact Name</label>
					<div class="input-group width">
                          <form:input class="form-control shadow-sm" path="contactName"/>  
                    </div>
			</div>
			<div class="row">
					
					<label class="font-weight-bold" >Contact Number</label>
					<div class="input-group width">
                          <form:input class="form-control shadow-sm" path="contactNumber"/> 
                    </div>
			</div>
			<div class="row">
					
					<label class="font-weight-bold">Contact Email</label>
					<div class="input-group width">
                          <form:input class="form-control shadow-sm" path="contactEmail"/>
                    </div>
			</div>
			<div class="row">
					
					<div class="input-group width">
                          <input class="btn btn-primary btn-block btnd shadow" type="submit" value="Submit"/>
                    </div>
			</div>
			</div>
		<div>
		<a class="btn btn-danger btn-block btn1 shadow" href="viewContacts">View All Contacts</a>
		</div>
	</form:form>
			
			</div>
	
	</fieldset>
</body>
</html>