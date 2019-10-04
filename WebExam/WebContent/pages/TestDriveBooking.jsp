<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="custom" uri="../WEB-INF/custom.tld"%>
<!DOCTYPE html>
<jsp:include page="header.jsp" />




<div id="content">
	<div id="form">
		<h2 class="text-center">Book a Drive</h2>
		<form name="testDriveBooking"
			action="${pageContext.request.contextPath}/TestDriveServlet"
			method="post">
			<input type="hidden" id="currentPage" name="currentPage" value="book">
			<fieldset>
				<legend>Book a Drive</legend>
				<label for="bookingid">BOOKING ID</label> <input type="text"
					name="bookingid" required><span class="error-text">
					*</span><br> <label for="customername">Customer Name</label> <input
					type="text" name="customername" required><span
					class="error-text"> *</span><br> <label for="drivinglic">Driving
					License</label> <input type="text" name="drivinglic" required><span
					class="error-text"> *</span><br> <label for="make">Vehicle
					Make</label> <select>
					<option value="zest">zest</option>
					<option value="safari">safari</option>
					<option value="manza">manza</option>
					<option value="audi">Audi</option>
				</select><br> <label for="date">Proposed Drive Date</label> <input
					type="number" name="date"><br>

			</fieldset>
			<div class="text-center">
				<input type="submit" value="Drive">
			</div>

		</form>
	</div>
</div>

<jsp:include page="footer.jsp" />
