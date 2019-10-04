<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "custom" uri = "../WEB-INF/custom.tld"%>
<!DOCTYPE html>
 
<div id="content">
  <div id="form">
    <h2 class="text-center">Search tour</h2>
    <form  >
      <input type="hidden" id="currentPage" name="currentPage" value="searchBook">
      <fieldset>
        <legend>Search Criteria</legend>
        <label for="query">Tour Cost</label>
        <input type="text" name="query"  ><span class="error-text"> </span><br>
         <label for="query1">places of interest</label>
        <input type="text" name="query2"  ><span class="error-text"> </span><br>
      </fieldset>
      <div class="text-center">
        <input type="submit" value="Search">
      </div>
      <c:if test="${not empty bList}">
        <br>
        <table name="list-book-count">
          <tr>
            <th>Tour Name</th>
            <th>Starting Location</th>
            <th>Places to visit</th>
            <th>No. of tour Days</th>
            <th>Tour cost</th>
            <th>Discount %</th>
          </tr>
        <c:forEach var="book" items="${bList}">
          <tr>
            <td><c:out value="${book.getBookId()}"/></td> 
            <td><c:out value="${book.getBookName()}"/></td>
            <td><c:out value="${book.getBookCategory()}"/></td>
          </tr>
        </c:forEach>
        </table>
      </c:if>
   
    </form>
  </div>
</div>

<jsp:include page="footer.jsp"/>
