
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Icon</title>
    <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans&display=swap" rel="stylesheet">

    <style type="">
        body {
            background: url(https://cdn.pixabay.com/photo/2018/05/12/19/20/mosaic-3394375_1280.jpg);
            font-size: 20px;

            background-size: cover;
            text-align: center;
        }

        #username {
            font-size: 20px;

        }

        #lastname {
            font-size: 20px;

        }

        #firstname {
            font-size: 20px;
        }

        form {
            text-align: center;
            padding: 50px;
        }

    </style>
</head>
<body>


<form:form action="submitlog"  modelAttribute="LogForm">
    Username:<form:input type="text" path="Username"></form:input>
    <br><br>
    Password:<form:input path="Parola"></form:input>
    <br><br>
    TipUser: <form:select path="TipUser">
    <form:option value="Medic" label="Medic"/>
    <form:option value="Pacient" label="Pacient"/>
    <form:option value="Ingrijitor" label="Ingrijitor"/>
</form:select>
    <br><br>
    <input type="submit" value="Submit" />
</form:form>


</body>
</html>