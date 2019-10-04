<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<jsp:include page="header.jsp"/>
<jsp:include page="menu.jsp"/>

<div id="content">
  <div id="form">
    <h2 class="text-center">Register Employee</h2>
    <form name="register" action="${pageContext.request.contextPath}/registration" method="post">
      <input type="hidden" id="currentPage" name="currentPage" value="register">
      <fieldset>
        <legend>Employee Registration</legend>
        <label for="empName">Employee Name</label>
        <input type="text" name="empName" required><span class="error-text"> *</span><br>
        <label for="empNum">Employee ID</label>
        <input type="number" name="empNum" required><span class="error-text"> *</span><br>
        <label for="empDob">Birth Date</label>
        <input type="Date" name="empDob"  placeholder="DD-MM-YYYY" required><span class="error-text"> *</span><br>
        <label for="empGender">Gender </label>
        <input type="radio" name="empGender" value="male"> Male
        <input type="radio" name="empGender" value="female"> Female<br>
        <label for="empEmail">Email </label>
        <input type="email" name="empEmail" required><span class="error-text"> *</span><br>
        <label for="empAltEmail">Alternate Email</label>
        <input type="email" name="empAltEmail" required><span class="error-text"> *</span><br>
        <label for="empPhone">Phone number </label>
        <input type="number" name="empPhone" min="1000000000" required><span class="error-text"> *</span><br>
        <label for="empAltPhone">Alternate Phone </label>
        <input type="number" name="empAltPhone" min="1000000000" required><span class="error-text"> *</span><br>
      </fieldset><br>
      <fieldset>
        <legend>Policy Information</legend>
        <label for="policyStart">Policy Start Date </label>
        <input type="date" name="policyStart"  placeholder="DD-MM-YYYY" required><span class="error-text"> *</span><br>
        <label for="policyLen">Policy Period </label>
        <input type="number" name="policyLen" placeholder="in years" required><span class="error-text"> *</span><br>
        <label for="policySum">Total Sum Insured </label>
        <input type="number" name="policySum" required><span class="error-text"> *</span><br>
        <label for="policyPremium">Premium Amount </label>
        <input type="number" name="policyPremium" placeholder="per year" disabled><br>
      </fieldset><br>
      <fieldset>
        <legend>Bank Information</legend>
        <label for="empBankNum">Bank Account Number </label>
        <input type="text" name="empBankNum" required><span class="error-text"> *</span><br>
        <label for="empBankName">Bank Name </label>
        <input type="text" name="empBankName" required><span class="error-text"> *</span><br>
        <label for="empBankCode">IFSC Code </label>
        <input type="text" name="empBankCode" required><span class="error-text"> *</span><br>
      </fieldset>
      <div class="text-center">
        <input type="submit" value="Register">
      </div>
    </form>
  </div>
</div>

<jsp:include page="footer.jsp"/>
