<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<jsp:include page="header.jsp" />
<jsp:include page="footer.jsp" />
<div id="menu">
	<ul>
		<li><a
			class="${pageContext.request.requestURI eq '/WebContent/pages/TestDriveBooking.jsp' ? 'active' : ''}"
			href="${pageContext.request.contextPath}/pages/TestDriveBooking.jsp">Test
				Drive</a></li>
		<li><a
			class="${pageContext.request.requestURI eq '/WebContent/pages/CancelBooking.jsp' ? 'active' : ''}"
			href="${pageContext.request.contextPath}/pages/CancelBooking.jsp">Cancel
				Drive</a></li>



	</ul>
</div>