<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
.containerform
{
 width:1080px;
 border:1px solid red;
}
.reqpform
{
 width:500px;
 margin-right:40px;
 float:left;
 border:2px dotted cyan;
}
.getreqform
{
 width:500px;
 margin-left:30px;
 float:center;
 border:2px solid blue;
}
</style>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>

<!-- <div class="containerform"> 
 <div class="reqpform">
 <h3>Request Param</h3>
<form action="modeldemo" >
	<table align="center">
	 <tr>
	   <td>Enter Username</td>
	   <td><input type="text" name="un"></td>	   
	 </tr>
	<tr>
	   <td>Enter Password</td>
	   <td><input type="password" name="pass"></td>	   
	 </tr>
	 <tr>	    
	   <td colspan="2"><input type="submit" value="Login"></td>	   
	 </tr>
	</table>
</form>
</div>
<div class="getreqform">
 <h3>Get Parameter Example form </h3>
<form action="getParaSubmit" >
	<table align="center">
	 <tr>
	   <td>Enter Username</td>
	   <td><input type="text" name="unp"></td>	   
	 </tr>
	<tr>
	   <td>Enter Password</td>
	   <td><input type="password" name="passp"></td>	   
	 </tr>
	 <tr>	    
	   <td colspan="2"><input type="submit" value="Login"></td>	   
	 </tr>
	</table>
</form>
</div>
</div>
<div class="getreqform">
 <h3>Form post method </h3>
<form action="postSubmit" method="post">
	<table align="center">
	 <tr>
	   <td>Enter Username</td>
	   <td><input type="text" name="unpost"></td>	   
	 </tr>
	<tr>
	   <td>Enter Password</td>
	   <td><input type="password" name="passpost"></td>	   
	 </tr>
	 <tr>	    
	   <td colspan="2"><input type="submit" value="Send"></td>	   
	 </tr>
	</table>
</form>
</div>-->
<div class="getreqform">
<form action="item" method="post">
	<table align="center">
	 <tr>
	   <td>Enter item_name</td>
	   <td><input type="text" name="in"></td>	   
	 </tr>
	<tr>
	   <td>Enter item_price</td>
	   <td><input type="text" name="ip"></td>	   
	 </tr>
	 <tr>
	   <td>Enter quantity</td>
	   <td><input type="text" name="q"></td>	   
	 </tr>
	<tr>
	   <td>Enter discount</td>
	   <td><input type="text" name="d"></td>	   
	 </tr>
	 <tr>
	 <td><input type="submit" value="Submit"></td>
	 </tr>
	</table>
</form>
</div>
</body>
</html>