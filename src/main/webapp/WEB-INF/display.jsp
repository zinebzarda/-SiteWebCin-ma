%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Display Films and Reservations</title>
</head>
<body>

<h1>List of Films</h1>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Description</th>
        <th>Runtime</th>
        <th>Genre</th>
        <th>Produced In</th>
        <th>Directed By</th>
        <th>Picture URL</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="film" items="${films}">
        <tr>
            <td>${film.idFilm}</td>
            <td>${film.titleFilm}</td>
            <td>${film.descriptionFilm}</td>
            <td>${film.runTimeFilm}</td>
            <td>${film.genreFilm}</td>
            <td>${film.producedIn}</td>
            <td>${film.directedBy}</td>
            <td>${film.pictureURL}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<h1>List of Reservations</h1>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>User ID</th>
        <th>Film ID</th>
        <th>Date</th>
        <th>Number of Billets</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="reservation" items="${reservations}">
        <tr>
            <td>${reservation.idReservation}</td>
            <td>${reservation.idUser}</td>
            <td>${reservation.idFilm}</td>
            <td>${reservation.dateReservation}</td>
            <td>${reservation.numberBillets}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
