<!DOCTYPE html>
<html lang="en" xmlns="http://www/thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PetPeers Application</title>
    <link rel="stylesheet"
     href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
     integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
    crossorigin="anonymous">

    <style>
        body {
          background-image: url('images/cat.jpg');
          background-repeat: no-repeat;
          background-size: cover;
        }

        /* Container blending to the background*/
        .container {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            background-color: rgba(255, 255, 255, 0.3); 
            padding: 20px;
            border-radius: 10px;
            text-align: center;
            width: 30%;

        }


    </style>
</head>
<body>
    <nav class="navbar navbar-expand-md bg-dark navbar-dark">
        <!-- Brand -->
        <a class="navbar-brand" href="#">PetPeers App</a>
 
        <!-- Toggler/collapsibe Button -->
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
 
    </nav>
    <br> <br>
    <!-- <div class="container"> -->
        <!-- <div class="row"> -->
            <div class="col-lg-6 col-md-6 col-sm-6 container justify-content-center card"><br>
                <div class="alert alert-danger" th:if="${param.loggedOut}">
                    <p>You have been Logged Out</p>
                </div>
                <br>
                <h2 class="text-center"> Pet Peers Application </h2>
 
                <br>
               
                <a class="btn btn-primary" th:href="@{/login}" role="button">Login Here</a><br>
                <a class="btn btn-primary" th:href="@{/register/new}" role="button">Register Here</a>
               
            </div>
        <!-- </div> -->
    <!-- </div> -->
</body>
</html>