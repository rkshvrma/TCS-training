<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix= "custom" uri = "../WEB-INF/custom.tld"%>
<!DOCTYPE html>
<jsp:include page="header.jsp"/>
<jsp:include page="menu.jsp"/>
<div id="content">
  <div id="form">
    <h2 class="text-center">Add Book</h2>
    <form name="addBook" action="${pageContext.request.contextPath}/BookServlet" method="post">
      <input type="hidden" id="currentPage" name="currentPage" value="addBookPage">
      <fieldset>
        <legend>Book Information</legend>
        <label for="bookid">Book ID: </label>
        <input type="number" name="bookid" min="0" required><span class="error-text"> *</span><br>
        <label for="bookname">Book Name: </label>
        <input type="text" name="bookname" required><span class="error-text"> *</span><br>
        <label for="bookcat">Book Category: </label>
        <input type="text" name="bookcat" required><span class="error-text"> *</span><br>
      </fieldset>
      <div class="text-center">
        <input type="submit" value="Add Book"> <input type="button" value="Clear" onclick="resetAddBook()">
      </div>
     </form>
  </div>
</div>

<jsp:include page="footer.jsp"/>
