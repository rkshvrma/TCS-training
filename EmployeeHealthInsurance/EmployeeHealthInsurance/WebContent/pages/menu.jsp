<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<c:if test="${empty user}">
  <jsp:include page="anonMenu.jsp"/>
</c:if>
<c:if test="${not empty user}">
  <jsp:include page="memberMenu.jsp"/>
</c:if>

