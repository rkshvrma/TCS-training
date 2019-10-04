<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<div>
    <div id="footer">Copyright</div>
<div id="menu">
  <ul>
    
    <li><a
      class="${pageContext.request.requestURI eq '/Tour_Plan/pages/home.jsp' ? 'active' : ''}"
      href="${pageContext.request.contextPath}/pages/home.jsp">HOME</a></li>
      </ul>
  </div>
  </div>
</body>
</html>