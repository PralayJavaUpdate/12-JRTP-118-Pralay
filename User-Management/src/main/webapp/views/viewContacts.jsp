<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
	function confirmDelete(){
		return confirm("Are you sure, you want to delete?");
	}
</script>
<style type="text/css">
	.container{
		display:flex;
		justify-content: center;
		align-items: center;
		border:1px solid black;
		border-radius: 20px;
		padding:20px;
		background-color:#659DBD;
		flex-direction: column;
		box-shadow: 10px 10px 18px black;
		
	}
	
	h1{
		text-align: center;
		text-decoration: underline;
		color:#950740;
		text-shadow: 2px 2px 10px black;
	}
	
	.Tstyle{
		width:100%;
		border-collapse: collapse;
		font-size: 20px;
		font-weight: bold;
		border-color: black;
		
		
	}
	
	.btn{
		display:inline-block;
		text-decoration: none;
		font-size:20px;
		font-weight: bold;
		text-align: center;
		justify-content:center;
		margin-top:40px;
		padding:20px;
		background-color: #5CDB95;
		border-radius: 40px;
		box-shadow: 5px 5px 10px black;
		
	}
	
	.btn1{
	
		text-align: center;
	}
	
	a{
		text-decoration: none;
		color:#66FCF1;
	}
	
	.dTable{
		
		margin-left: 10px;
	}
	
	tbody {
		text-align: center;
	}
	
	th{
		text-decoration: underline;
	}
	
	body{
		background-color: #34568B;
	}

</style>
</head>
<body>

	

	<h1>View Contacts Here</h1>
	<div class="container">
	<table border="1" class="Tstyle">
		<thead>
			<tr>
				<th>Contact Name</th>
				<th>Contact Number</th>
				<th>Contact Email</th>
				<th>Action</th>				
			</tr>
		</thead>		
		<tbody>
			<c:forEach items="${contacts}" var="c">
				<tr>
					<td>${c.contactName}</td>
					<td>${c.contactNumber}</td>
					<td>${c.contactEmail}</td>
					<td class="dTable">
						<a href="edit?cid=${c.contactId}">Edit</a>&nbsp; &nbsp;
						<a href="delete?cid=${c.contactId}" onclick="return confirmDelete()">Delete</a>
					</td>
				</tr>
			</c:forEach>	
		</tbody>	
	</table>
	
	</div>
	<div class="btn1">
	<a class="btn" href="loadForm">+Add New Contact</a>
	</div>
	
</body>
</html>