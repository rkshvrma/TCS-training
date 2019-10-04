<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "custom" uri = "../WEB-INF/custom.tld"%>
<!DOCTYPE html>
<jsp:include page="header.jsp"/>
<jsp:include page="menu.jsp"/>
<div id="content">
  <div id="form">
    <h2 class="text-center">Search Book</h2>
    <form name="searchBook" action="${pageContext.request.contextPath}/BookServlet" method="post">
      <input type="hidden" id="currentPage" name="currentPage" value="searchBook">
      <fieldset>
        <legend>Search Criteria</legend>
        <label for="query">Book Category: </label>
        <input type="text" name="query" required><span class="error-text"> *</span><br>
      </fieldset>
      <div class="text-center">
        <input type="submit" value="Search">
      </div>
      <c:if test="${not empty bList}">
        <br>
        <table name="list-book-count">
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Category</th>
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
      <custom:BookSearchOutput results="${bList}"/>
    </form>
  </div>
</div>

<jsp:include page="footer.jsp"/>
