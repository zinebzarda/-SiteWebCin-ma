<%@ page import="jee.javapack.beans.Film" %>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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



<%--<c:if test="${ not empty requestScope.films }">
<form action="s" method="post">
    <label for="title">Enter Movie Title:</label>
    <input type="text" id="title" name="titleFilm">
    <button type="submit">Search</button>
</form>

<h1>Résultats de la recherche</h1>

    <c:set var="films" value="${ requestScope.films }" />

    <c:if test="${ not empty films }">
        <ul>
            <c:forEach var="film" items="${ films }">
                <li>
                    <strong>Title:</strong> ${ film.titleFilm }<br>
                    <strong>Description:</strong> ${ film.descriptionFilm }<br>
                    <strong>Run Time Film:</strong> ${ film.runTimeFilm } minutes<br>
                    <strong>Genre Film:</strong> ${ film.genreFilm }<br>
                    <strong>Produced In:</strong> ${ film.producedIn }<br>
                    <strong>Directed by:</strong> ${ film.directedBy }<br>
                    <img src="${ film.pictureURL }" alt="Picture">
                </li>
            </c:forEach>
        </ul>
    </c:if>
    <c:if test="${ empty films }">
        <p>Aucun film trouvé avec ce titre.</p>
    </c:if>
</c:if>
<c:if test="${ empty requestScope.films }">
    <p>Aucun résultat à afficher.</p>
</c:if>
--%>
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