<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="custom" uri="../WEB-INF/custom.tld"%>
<script>
	var ctx = "${pageContext.request.contextPath}"
</script>
<!DOCTYPE html>
<jsp:include page="header.jsp" />



<div id="content">
	<div id="form">
		<h2 class="text-center">Search Tour</h2>
		<form name="searchTour"
			action="${pageContext.request.contextPath}/TestDriveServlet"
			method="post">
			<input type="hidden" id="currentPage" name="currentPage"
				value="search">
			<fieldset>
				<legend>View Bookings</legend>
				<label for="date">BOOKING DATE</label> <input type="number"
					name="date" title="Please fill out one of these fields." required><br>

			</fieldset>
			<div class="text-center">
				<input type="submit" value="Search">
			</div>
		</form>
		<c:if test="${not empty tourList}">
			<br>
			<table name="Drive-search-results">
				<tr>
					<th>Name</th>
					<th>Starting Location</th>
					<th>Places to Visit</th>
					<th>Places tot</th>
					<th></th>
				</tr>
				<c:forEach var="tour" items="${driveList}">
					<tr>
						<td><c:out value="${drive.getBookingId()}" /></td>
						<td><c:out value="${drive.getCustomerName() }" /></td>
						<td><c:out value="${drive.getLicenseNo()}" /></td>
						<td><c:out value="${drive.getVehicleMake()}" /></td>
					</tr>
				</c:forEach>
			</table>
			<input type="button" value="view listings"
				>
		</c:if>

	</div>
</div>

<jsp:include page="footer.jsp" />
