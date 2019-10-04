 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<jsp:include page="header.jsp"/>
<jsp:include page="menu.jsp"/>
<div id="content">
  <div id="form">
    <h2 class="text-center">Update Book</h2>
    <form name="updateBook" action="${pageContext.request.contextPath}/BookServlet" method="post">
      <input type="hidden" id="currentPage" name="currentPage" value="updateBookPage">
      <fieldset>
        <legend>Book Information</legend>
        <label for="bookid">Book ID: </label>
        <input type="number" name="bookid" min="0" required><span class="error-text"> *</span><br>
        <label for="bookname">New Name: </label>
        <input type="text" name="bookname" required><span class="error-text"> *</span><br>
        <label for="bookcat">New Category: </label>
        <input type="text" name="bookcat" required><span class="error-text"> *</span><br>
      </fieldset>
      <div class="text-center">
        <input type="submit" value="Update Book"> <input type="button" value="Clear" onclick="resetUpdateBook()">
      </div>
      <custom:BookUpdatedOutput updated="${updated}"/>
    </form>
  </div>
</div>

<jsp:include page="footer.jsp"/>
