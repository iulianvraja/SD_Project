<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <script src="https://kit.fontawesome.com/bd669c2413.js" crossorigin="anonymous"></script>

    <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans&display=swap" rel="stylesheet">


    <style type="text/css">

        .textzone p {

            font-size: 16px;
            font-family: 'Alatsi', sans-serif;
            color: black;

        }
        .elem {
            height: 350px;
            border-bottom: 30px;

        }

        .container {
            margin-left: 10%;
            margin-right: 10%;


        }

        body {
            background: url(https://www.google.com/url?sa=i&url=https%3A%2F%2Fphys.org%2Fnews%2F2019-11-natural-world.html&psig=AOvVaw1ePC0K5xJZNkUSTONyOzAU&ust=1603728789563000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCICjwbiR0OwCFQAAAAAdAAAAABAD);

            background-position: center;
            font-family: 'Open Sans', sans-serif;
            color: white;
        }

        html {
            height: 100%;
        }

        h1 {
            font-weight: 700;
            font-size: 5em;
        }
        .c1 {
            background-color: white;
            height: 100%;
        }


        ul.products li {
            width: 200px;
            display: inline-block;
            vertical-align: top;
        }
    </style>
    <title></title>
</head>
<nav class="navbar navbar-default">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>

        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">Account Registered <span class="caret"></span></a>

                </li>
                <li><a href="#">About</a></li>
                <li><a href="#">Contact</a></li>
                <li class="Action for medic">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">Action for medic<span class="caret"></span></a>
                    <ul class="dropdown-menu">

                        <li><a href="/addpacient">Adaugare pacient</a></li>
                        <li><a href="/deletepacient">Stergere Pacient</a></li>
                        <li><a href="/updatepacient">Update Pacient</a></li>
                        <li><a href="/afisarepacienti">Afisare pacienti</a></li>

                    </ul>

                </li>
            </ul>

            <ul class="nav navbar-nav navbar-right">
                <li><a href="/loginpage" method="get"><i class="fas fa-user-shield"></i>Login</a></li>
                <li><a href="/recover" method="get"> <i class="fas fa-address-card"></i>Recover pass</a></li>

            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<div class="container">
    <c:if test="${not empty list}">


    <div class="col-lg-4 col-md-6 elem" >
        <c:forEach var="listValue" items="${list}">
            <div class="c1">


                <div class="textzone" visible="true">

                    <p> ${listValue.nume}</p>
                    <p> ${listValue.adr}</p>
                    <p> ${listValue.data_n}</p>
                    <p> ${listValue.sex}</p>
                    <form action="/delp">
                        <p hidden="true" visible="false"><input type="text" name="id" value="${listValue.id}" visible="false"></p>
                        <br>
                        <input  type="submit" value="DeletePacient" />
                    </form>
                    <form action="/upp">
                        <p hidden="true" visible="false"><input type="text" name="id" value="${listValue.id}" visible="false"></p>
                        <br>
                        <input  type="submit" value="UpdatePacient" />
                    </form>



                </div>

            </div>
        </c:forEach>
        </c:if>
    </div>

</div>





</body>

<script
        src="https://code.jquery.com/jquery-3.4.1.js"
        integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
        crossorigin="anonymous"></script>
</html>
