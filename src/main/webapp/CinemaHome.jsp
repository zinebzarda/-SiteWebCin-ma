<%@ taglib prefix="c" uri="c"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Maregara Cinema</title>
    <link rel="icon" href="https://i.ibb.co/30kBSnC/logo.png" >
    <!-- bootstrap css link -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <!-- Font awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==" crossorigin="anonymous" referrerpolicy="no-referrer">
    <!-- Css link -->
    <style><%@include file="css/style.css"%></style>
    <!-- BOX ICONS  -->
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>



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


</body>
</html>