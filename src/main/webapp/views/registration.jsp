<!DOCTYPE html>
<html lang="en" xmlns="http://www/thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PetPeers</title>
    <link rel="stylesheet"
     href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
     integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
    crossorigin="anonymous">

    <style>
        body {
          background-image: url('images/cat.jpg');
          background-repeat: no-repeat;
          background-size: cover;
          /* margin: 0; */
        }
  
        /* Container blending to the background*/
        .container {
            
            background-color: rgba(255, 255, 255, 0.3); 
            padding: 20px;
            border-radius: 10px;
            /* text-align: center; */
            /* width: 30%; */
  
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
 
        <!-- Navbar links -->
        <div class="collapse navbar-collapse" id="collapsibleNavbar">
            <ul class="navbar-nav">
              <li class="nav-item">
                <a class="nav-link" href="#" th:href="@{/petpeersapplication}"> Home </a>
              </li>
            </ul>
        </div>
    </nav>
    <br>
    <div class="container">
        <div class="row">
            <div class="col-lg-6 col-md-6 col-sm-6 container justify-content-center card">
                <h1 class="text-center"> Add New user </h1>
                <div class="card-body">
                    
                    <form th:action="@{/register}" th:object="${user}" method="POST">
                        <div class="alert alert-success" th:if="${param.success}">
                            <p>You have been registered.</p>
                        </div><br>
                        <div class="from-group">
                            
                            <label> First Name </label><br>
                            <input type="text" name="firstName" th:field="*{firstName}"
                                placeholder="Enter first Name" />
                        </div><br>
 
                        <div class="form-group">
                            <label> Last Name </label><br>
                            <input type="text" name="lastName" th:field="*{lastName}"
                                placeholder="Enter Last Name" />
                        </div>
 
                        <div class="form-group">
                            <label> Phone Number </label><br>
                            <input type="text" name="phone" th:field="*{phone}" placeholder="Enter Phone Number"/>
                        </div>
 
                        <div class="form-group">
                            <label> Email </label><br>
                            <input type="text" name="email" th:field="*{email}" placeholder="Enter Email" required/>
                        </div>
 
                        <div class="form-group">
                            <label>Password</label><br>
                            <input type="password" name="password" th:field="*{password}" placeholder="Enter Password" required/>
                        </div>
 
                        <div class="box-footer">
                            <button type="submit" class="btn btn-primary">
                                Submit
                            </button><br>
                            <span>Already registered? <a th:href="@{/login}">Login Here</a></span>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>