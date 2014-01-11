<%@ include file="/WEB-INF/view/include.jsp" %>

<html>
  <head><title>Hello :: Spring Application</title></head>
  <body>
    <h1>Hello - Spring Application</h1>
    <p>Greetings, it is now <c:out value="${now}" /></p>
    <form name=myForm>
   		<input type="hidden" name="firstName" >
    </form>
  </body>
</html>