<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<script src="${pageContext.request.contextPath}/resources/js/vendor/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/vendor/script.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/flight_application_form.js"></script>

<script type="text/javascript">
   $( document ).ready(function() {
       getroles();
       getgender();
   });

</script>
<div class="content-wrapper">
<br>
   <form:form method="POST" modelAttribute="registerUser" action="${pageContext.request.contextPath}/update" class="form-signin">
      <h2 class="form-signin-heading">Update Profile</h2>
      <c:if test="${not empty successMessage}">
       <div id="serverError" class="alert alert-success alert-dismissable fade show successMessage">
          <button class="close" data-dismiss="alert" aria-label="Close">×</button>
          <strong>Success!</strong> ${successMessage}</div>
      </c:if>
      <br>
      <c:if test="${not empty serverError}">
       <div id="serverError" class="alert alert-warning alert-dismissable fade show plErroMessage">
            <button class="close" data-dismiss="alert" aria-label="Close">×</button>
            <strong>Warning!</strong> ${serverError}</div>

      </c:if>

      <div class="row">

      <spring:bind path="firstname">
               <div class="form-group col-lg-4 ${status.error ? 'has-error' : ''}">
                  <form:input type="text" onkeypress="return alpha(event)" oncopy="return false" onpaste="return false"  path="firstname" name="firstname" class="form-control" placeholder="First Name"
                     autofocus="true" value="${user.firstName}"></form:input>
                  <form:errors  path="firstname"></form:errors>
               </div>
            </spring:bind>

      <spring:bind path="lastname">
               <div class="form-group col-lg-4 ${status.error ? 'has-error' : ''}">
                  <form:input type="text" onkeypress="return alpha(event)" oncopy="return false" onpaste="return false"  path="lastname" name="lastname" class="form-control" placeholder="Last Name"
                     autofocus="true" value="${user.lastName}"></form:input>
                  <form:errors  path="lastname"></form:errors>
               </div>
            </spring:bind>
      <spring:bind path="username">
         <div class="form-group col-lg-4 ${status.error ? 'has-error' : ''}">
            <form:input type="text" onkeypress="return alpha(event)" oncopy="return false" onpaste="return false"  path="username" name="username" class="form-control" placeholder="Username"
               autofocus="true" value="${user.username}" ></form:input>
            <form:errors  path="username"></form:errors>
         </div>
      </spring:bind>

      </div>


      <div class="row">
      <spring:bind path="mobileNumber">
         <div class="form-group  col-lg-4 ${status.error ? 'has-error' : ''}">
            <form:input type="text" value="${user.mobileNumber}"  required="required" oncopy="return false" onpaste="return false" path="mobileNumber" maxlength="10" minlength="10"  class="form-control" onKeyPress="return isNumber(event)"  name="mobileNumber" placeholder="Mobile Number" ></form:input>
            <form:errors  path="mobileNumber"></form:errors>
         </div>
      </spring:bind>
      <spring:bind path="age">
               <div class="form-group col-lg-4  ${status.error ? 'has-error' : ''}">
                  <form:input type="text" value="${user.age}"  required="required" oncopy="return false" onpaste="return false" path="age" maxlength="2" minlength="2"  class="form-control" onKeyPress="return isNumber(event)"  name="age" placeholder="Age" ></form:input>
                  <form:errors  path="age"></form:errors>
               </div>
            </spring:bind>
      <spring:bind path="emailAddress">
         <div class="form-group col-lg-4  ${status.error ? 'has-error' : ''}">
            <form:input type="text" value="${user.email}" required="required" oncopy="return false" onpaste="return false" path="emailAddress" maxlength="40" minlength="10"  class="form-control"  name="emailAddress" placeholder="Email Address" ></form:input>
            <form:errors  path="emailAddress"></form:errors>
         </div>
      </spring:bind>
      </div>

      <div class="row">
      <spring:bind path="p_address">
               <div class="form-group col-lg-4  ${status.error ? 'has-error' : ''}">
                  <form:textarea  rows="4" value="${user.pAddress}" type="text"  required="required" oncopy="return false" onpaste="return false" path="p_address" maxlength="40" minlength="10"  class="form-control"  name="p_address" />
                  <form:errors  path="p_address"></form:errors>
               </div>
            </spring:bind>

            <spring:bind path="c_address">
                     <div class="form-group col-lg-4  ${status.error ? 'has-error' : ''}">
                        <form:textarea type="text" value="${user.cAddress}" rows="4"  required="required" oncopy="return false" onpaste="return false" path="c_address" maxlength="40" minlength="10"  class="form-control"  name="c_address" />
                        <form:errors  path="p_address"></form:errors>
                     </div>
                  </spring:bind>


            </div>

            <spring:bind path="gender">
                           <div class="form-group  ${status.error ? 'has-error' : ''}">
                              <form:label path="gender" for="gender">Select Gender</form:label>
                              <form:select path="gender" name="gender" class="form-control" id="gender">

                              </form:select>
                              <form:errors  path="gender"></form:errors>
                           </div>
                        </spring:bind>
      <spring:bind path="roleId">
         <div class="form-group  ${status.error ? 'has-error' : ''}">
            <form:label path="roleId" for="roles">Select Roles</form:label>
            <form:select path="roleId" name="roleId" class="form-control" id="roles">
            </form:select>
            <form:errors  path="roleId"></form:errors>
         </div>
      </spring:bind>
      <spring:bind path="password">
         <div class="form-group ${status.error ? 'has-error' : ''}">
            <form:input type="password" path="password" oncopy="return false" onpaste="return false" class="form-control" placeholder="Password"></form:input>
            <form:errors path="password"></form:errors>
         </div>
      </spring:bind>
      <spring:bind path="passwordConfirm">
         <div class="form-group ${status.error ? 'has-error' : ''}">
            <form:input type="password" oncopy="return false" onpaste="return false" path="passwordConfirm" class="form-control"
               placeholder="Confirm your password"></form:input>
            <form:errors path="passwordConfirm"></form:errors>
         </div>
      </spring:bind>

      <!-- Captcha -->
                        <table >
                        <tbody>
                        <tr>
                        <td>
                        <div>
                        <img id="captcha_id" name="imgCaptcha" src="captcha.jpg">
                        </div>
                        </td>
                        <td align="left"><a href="javascript:;"
                           title="change captcha text"
                           onclick="document.getElementById('captcha_id').src = 'captcha.jpg?' + Math.random();  return false">
                        <i class="fa fa-refresh"></i>
                        </a></td>
                        </tr>
                        <tr>
                        <td>Enter Image Text</td>
                        <td><form:input onkeypress="return alpha(event)" oncopy="return false" onpaste="return false" path="captcha" id="captcha" name="captcha" /></td>
                        <form:errors style="color:red;" path="captcha"></form:errors>
                        </tr>
                        </tbody>
                        </table>
                        <!-- Captcha -->
      <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
      <c:remove var="successMessage" scope="session" />
   </form:form>
   </div>
</div>