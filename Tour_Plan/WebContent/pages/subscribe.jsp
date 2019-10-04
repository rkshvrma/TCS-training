<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix= "custom" uri = "../WEB-INF/custom.tld"%>
<!DOCTYPE html>
 
<div id="content">
  <div id="form">
    <h2 class="text-center">Subscribe Tour package</h2>
    <form >
      <input type="hidden" id="currentPage" name="currentPage" value="addBookPage">
      <fieldset>
        <legend>Subscribe</legend>
         <label for="usertype">UserType</label> 
         		<select	name="type" required>
					<option value="Admin">Admin</option>
					<option value="Member">Member</option>
				</select>
        <label for="Membername ">Member_name </label>
        <input type="text" name="Membername" required><span class="error-text"> *</span><br>
        <label for="NOP">no_of_passengers</label>
        <input type="text" name="NOP" ><span class="error-text"> *</span><br>
        <label for="amount">Amount to be paid</label>
        <input type="text" name="amount" required><span class="error-text"> *</span><br>
        <label for="jsd">Journey_start_date</label>
        <input type="date" name="jsd" required><span class="error-text"> *</span><br>
        <label for="Remarks">Remarks</label>
        <input type="text" name="Remarks" ><span class="error-text"> </span><br>
        
        
      </fieldset>
      <div class="text-center">
        <input type="submit" value="Create Tour" > 
       
      </div>
 
    </form>
  </div>
</div>

<jsp:include page="footer.jsp"/>
