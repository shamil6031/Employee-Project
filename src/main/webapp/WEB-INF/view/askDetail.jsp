<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="for" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Java Developer,Welcome!!!</h2>
<form:form action="showDetail" modelAttribute="employee">
    Name:<form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname:<form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary:<form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Department:<form:select path="department">
    <form:options items="${employee.departments}"/>
    <br>
    <br>
    <%--    Carbrand:<form:select path="carBrand">--%>
    <%--    Audi<form:radiobutton path="carBrand" value="Audi"/>--%>
    <%--    Mercedes<form:radiobutton path="carBrand" value="Mercedes"/>--%>
    <%--    BMW<form:radiobutton path="carBrand" value="BMW"/>--%>
    <br
    ><br>

    <br>
    <br>


</form:select>
    <br><br>
    Languages:
    <h3> EN<form:checkbox path="languages" value="English"/></h3>
    <h3> RU<form:checkbox path="languages" value="Russian"/></h3>
    <h3> DE<form:checkbox path="languages" value="Deutsch"/></h3>
    <h3> JA<form:checkbox path="languages" value="Japan"/></h3>

    <br>
    <br><br>
    <br>
    Car Brand:
    <br>
    <br>
    <form:radiobuttons path="carBrand" items="${employee.carbrands}"/>
    <br>
    <br>
    Mail:<form:input path="mail"/>
    <form:errors path="mail"/>
    <br>
    <br>
    PhoneNumber:<form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>

    <br><br>
    <input type="submit" value="OK">
</form:form>

</body>


</html>