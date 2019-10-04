<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<div id="menu">
  <ul>
    <li><a
      class="${pageContext.request.requestURI eq '/BookManagementWeb/pages/index.jsp' ? 'active' : ''}"
      href="${pageContext.request.contextPath}/pages/index.jsp">Home</a></li>
    <li><a
      class="${pageContext.request.requestURI eq '/BookManagementWeb/pages/addbook.jsp' ? 'active' : ''}"
      href="${pageContext.request.contextPath}/pages/addbook.jsp">Add Book</a></li>
    <li><a
      class="${pageContext.request.requestURI eq '/BookManagementWeb/pages/searchbook.jsp' ? 'active' : ''}"
      href="${pageContext.request.contextPath}/pages/searchbook.jsp">Search Book</a></li>
    <li><a
      class="${pageContext.request.requestURI eq '/BookManagementWeb/pages/updatebook.jsp' ? 'active' : ''}"
      href="${pageContext.request.contextPath}/pages/updatebook.jsp">Update Book</a></li>
    <li><a
      class="${pageContext.request.requestURI eq '/BookManagementWeb/pages/deletebook.jsp' ? 'active' : ''}"
      href="${pageContext.request.contextPath}/pages/deletebook.jsp">Delete Book</a></li>
    <li><a
      class="${pageContext.request.requestURI eq '/BookManagementWeb/pages/listbookcount.jsp' ? 'active' : ''}"
      href="${pageContext.request.contextPath}/pages/listbookcount.jsp">Book Count</a></li>
    <li><a
      class="${pageContext.request.requestURI eq '/BookManagementWeb/pages/listbooksbycategory.jsp' ? 'active' : ''}"
      href="${pageContext.request.contextPath}/pages/listbooksbycategory.jsp">All Books</a></li>
  </ul>
</div>