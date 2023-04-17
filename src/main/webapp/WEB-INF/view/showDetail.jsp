<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ul" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<%--<h2>Your Name:${employee.name}</h2>--%>
<%--<h2>Your Surname:${employee.surname}</h2>--%>
<%--<h2>Your salary:${employee.salary}</h2>--%>

<h1>Your name: ${employee.name}</h1>
<h1>Your surname: ${employee.surname}</h1>
<h1>Your salary: ${employee.salary}</h1>
<h1>Your department:${employee.department}</h1>
<h1>Your car:${employee.carBrand}</h1>
<h1>Your mail:${employee.mail}</h1>
<h1>Your phoneNumber:${employee.phoneNumber}</h1>


<h1>Your languages:<ul:forEach var = "l" items ="${employee.languages}"><h1>
    <li>${l}</li>

</ul:forEach>



</body>




</html>

