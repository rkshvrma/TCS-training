<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<div id = "menu">
<ul>

<li><a
		clas="${pagecontext.request.requestURI eq '/EmployeeHealthInsurance/pages/index.jsp' ? 'active' : ''}"
      href="${pageContext.request.contextPath}/pages/index.jsp">Home</a></li>
      <li><a
      	class="${pageContext.request.requestURI eq '/EmployeeHealthInsurance/pages/register.jsp' ? 'active' : ''}"
      href="${pageContext.request.contextPath}/pages/register.jsp">Register</a></li>
    <li class="float-right"><a
      class="${pageContext.request.requestURI eq '/EmployeeHealthInsurance/pages/login.jsp' ? 'active' : ''}"
      href="${pageContext.request.contextPath}/pages/login.jsp">Login</a></li>
</ul>
</div>