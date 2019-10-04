<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix= "custom" uri = "../WEB-INF/custom.tld"%>
<!DOCTYPE html>
 
<div id="content">
  <div id="form">
    <h2 class="text-center">Create Tour Plan</h2>
    <form >
      <input type="hidden" id="currentPage" name="currentPage" value="addBookPage">
      <fieldset>
        <legend>cancel tour plan</legend>
        <label for="bookingID">Booking ID</label>
        <input type="text" name="bookingID" required><span class="error-text"> *</span><br>
        
      </fieldset>
      <div class="text-center">
        <input type="button" value="cancel sub"> 
        
      </div>
 
    </form>
  </div>
</div>

<jsp:include page="footer.jsp"/>
