<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix= "custom" uri = "../WEB-INF/custom.tld"%>
<!DOCTYPE html>
<jsp:include page="header.jsp"/>

<div id="content">
  <div id="form">
    <h2 class="text-center">Delete Book</h2>
    <form name="cancel" action="${pageContext.request.contextPath}/TestDriveServlet" method="post">
      <input type="hidden" id="currentPage" name="currentPage" value="cancelDrive">
      <fieldset>
        <legend>Book Information</legend>
        <label for="bookid">Booking ID: </label>
        <input type="number" name="bookid"  required><span class="error-text"> *</span><br>
      </fieldset>
      <div class="text-center">
        <input type="submit" value="Cancel Drive">
      </div>
      
    </form>
  </div>
</div>

<jsp:include page="footer.jsp"/>
