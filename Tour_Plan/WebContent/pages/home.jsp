<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<div id="menu">
  <ul>
    
    <li><a
      class="${pageContext.request.requestURI eq '/Tour_Plan/pages/createtourplan.jsp' ? 'active' : ''}"
      href="${pageContext.request.contextPath}/pages/createtourplan.jsp">Create Tour</a></li>
    <li><a
      class="${pageContext.request.requestURI eq '/Tour_Plan/pages/searchtourplan.jsp' ? 'active' : ''}"
      href="${pageContext.request.contextPath}/pages/searchtourplan.jsp">Search Tour</a></li>
    <li><a
      class="${pageContext.request.requestURI eq '/Tour_Plan/pages/subscribe.jsp' ? 'active' : ''}"
      href="${pageContext.request.contextPath}/pages/subscribe.jsp">Subscribe tour</a></li>
    <li><a
      class="${pageContext.request.requestURI eq '/Tour_Plan/pages/canceltour.jsp' ? 'active' : ''}"
      href="${pageContext.request.contextPath}/pages/canceltour.jsp">Cancel Tour</a></li>
     
  </ul>
</div>