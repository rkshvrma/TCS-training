<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<jsp:include page="header.jsp"/>
<jsp:include page="menu.jsp"/>

<div id="content">
  <h2>Welcome to the Book Store!</h2>
  <p>Today's date: <%= (new java.util.Date()).toLocaleString() %></p>
</div>

<jsp:include page="footer.jsp"/>
