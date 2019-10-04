<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "custom" uri = "../WEB-INF/custom.tld"%>
<!DOCTYPE html>
<jsp:include page="header.jsp"/>
<jsp:include page="menu.jsp"/>
<div id="content">
  <div id="form">
    <h2 class="text-center">Book Count By Category</h2>
    <custom:BookCountByCategory/>
    <c:if test="${not empty pageScope.bookCountList}">
      <table name="list-book-count">
        <tr>
          <th>Category</th>
          <th>Count</th>
        </tr>
      <c:forEach var="entry" items="${pageScope.bookCountList}">
        <tr>
          <td><c:out value="${entry.key}"/></td> 
          <td><c:out value="${entry.value}"/></td>
        </tr>
      </c:forEach>
      </table>
    </c:if>
  </div>
</div>

<jsp:include page="footer.jsp"/>
