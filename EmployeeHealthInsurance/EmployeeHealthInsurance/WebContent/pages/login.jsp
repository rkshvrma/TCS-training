<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<jsp:include page="header.jsp"/>
<jsp:include page="menu.jsp"/>

<div id="content">
  <div id="form">
    <h2 class="text-center">Login</h2>
    <form name="login" action="${pageContext.request.contextPath}/TourServlet" method="post">
      <input type="hidden" id="currentPage" name="currentPage" value="login">
      <fieldset>
        <legend>Credentials</legend>
        <label for="loginid">Login ID: </label>
        <input type="text" name="loginid" required><span class="error-text"> *</span><br>
        <label for="password">Password: </label>
        <input type="password" name="password" required><span class="error-text"> *</span><br>
      </fieldset>
      <div class="text-center">
        <input type="submit" value="Login">
      </div>
      <custom:UserLoginFailed failed="${failed}"/>
    </form>
  </div>
</div>

<jsp:include page="footer.jsp"/>
