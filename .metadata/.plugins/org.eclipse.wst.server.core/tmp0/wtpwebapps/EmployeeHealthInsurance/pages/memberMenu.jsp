<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<div id="menu">
  <ul>
    <li><a
      class="${pageContext.request.requestURI eq '/TourManagementWeb/pages/index.jsp' ? 'active' : ''}"
      href="${pageContext.request.contextPath}/pages/index.jsp">Home</a></li>
    <li><a
      class="${pageContext.request.requestURI eq '/TourManagementWeb/pages/searchtour.jsp' ? 'active' : ''}"
      href="${pageContext.request.contextPath}/pages/searchtour.jsp">Search Tour</a></li>
    <li><a
      class="${pageContext.request.requestURI eq '/TourManagementWeb/pages/booktour.jsp' ? 'active' : ''}"
      href="${pageContext.request.contextPath}/pages/booktour.jsp">Book Tour</a></li>
    <li><a
      class="${pageContext.request.requestURI eq '/TourManagementWeb/pages/canceltour.jsp' ? 'active' : ''}"
      href="${pageContext.request.contextPath}/pages/canceltour.jsp">Cancel Tour</a></li>
      
    <li class="float-right"><a href="${pageContext.request.contextPath}/TourLogout">Logout</a></li>
  </ul>
</div>