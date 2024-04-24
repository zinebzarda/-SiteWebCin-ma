<%@ taglib prefix="c" uri="c"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>



<%--
<div class="col-md-2 mb-2">
    <label for="title">Title :</label>
    <input class="form-control mt-1" type="text" id="title" name="title">

</div>
<button type="submit">Chercher</button>
<div class="row">
    <c:forEach var="Film" items="${filmSe}">
        <div class="col-md-4">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">${Film.getTitleFilm()}</h5>

                    <a href="#" class="btn btn-primary">details</a>
                </div>
            </div>
        </div>
    </c:forEach>
</div>

--%>

</body>
</html>