<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix= "custom" uri = "../WEB-INF/custom.tld"%>
<!DOCTYPE html>
 
<div id="content">
  <div id="form">
    <h2 class="text-center">Create Tour Plan</h2>
     <form name="createTour" action="${pageContext.request.contextPath}/memberServlet" method="post">
      <input type="hidden" id="currentPage" name="currentPage" value="createtourplan">
      <fieldset>
        <legend>Tour Plan</legend>
        <label for="tourname">Tour Name </label>
        <input type="text" name="tourname" required><span class="error-text"> *</span><br>
        <label for="startloc">Starting Location</label>
        <input type="text" name="startloc" ><span class="error-text"> *</span><br>
        <label for="POI">Places of Interest </label>
        <input type="text" name="POI" required><span class="error-text"> *</span><br>
        <label for="tourcost">Tour Cost  </label>
        <input type="text" name="tourcost" required><span class="error-text"> *</span><br>
        <label for="NOTD">No. of tour days</label>
        <input type="text" name="NOTD" required><span class="error-text"> *</span><br>
         <label for="discount">Discount</label>
         <ul>
       <li>  <INPUT TYPE="radio" NAME="discount" VALUE="NO" CHECKED>
      		NO
            <BR></li>
         <li>   <INPUT TYPE="radio" NAME="discount" VALUE="YES">
             YES
            <BR></li>
            
           </ul> 
        <label for="disc">Discount (in %) </label>
        <input type="text" name="disc" required><span class="error-text"> *</span><br>
        
      </fieldset>
      <div class="text-center">
        <input type="submit" value="Create Tour"> 
        <input type="button" value="Clear">
      </div>
 
    </form>
  </div>
</div>

<jsp:include page="footer.jsp"/>
