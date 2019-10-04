<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="custom" uri="../WEB-INF/custom.tld"%>
<!DOCTYPE html>
 
<div id="content">
	<div id="form">
		<h2 class="text-center">LOGIN</h2>
		 
		 <form name="login" action="${pageContext.request.contextPath}/userServlet" method="post">
      <input type="hidden" id="currentPage" name="currentPage" value="login">
			
			<fieldset>
				<legend>LOGIN PAGE</legend>
				<label for="loginid">Login Id</label> <input type="text"
					name="loginid" min="0" required><span class="error-text">*</span><br>
				<label for="passwordid">Password</label> <input type="password"
					name="passwordid" required><span class="error-text">
					*</span><br> <label for="usertype">UserType</label> <select
					name="usertype">
					<option value="Admin">Admin</option>
					<option value="Member">Member</option>
				</select>
			</fieldset>
			<a href="home.jsp">create tour</a> 
			<div class="text-center">
				<input type="submit" value="LOGIN">  
			</div>
		 
		</form>
	</div>
</div>

