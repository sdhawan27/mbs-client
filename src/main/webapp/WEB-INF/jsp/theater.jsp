<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Movie Booking Site</title>
</head>

<body>
    <h3>Select theater:</h3>
    <select>
          <c:forEach var="theater" items="${theaterList}">
           <option value="${theater.tid}">${theater.name}</option>
          </c:forEach>
    </select>
</body>

</html>