<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/29/2021
  Time: 3:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <style>
        *{
            border: 0px;
            margin: 0px;
            padding: 0px;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">
            <img src="https://lh3.googleusercontent.com/proxy/TJ1BxNIrOZpcy2LpUfLPs_lUYZm6zcGb4VuATcyW5s_BcdBaZqe2fBkckXzMlMqugdKLkUMGpw1bqdnKy8qvoLVc_JSnuA8otFVPS0jdrKULcOhZeSekknN4TP8" alt="" width="200px" height="50px" class="d-inline-block align-text-top">
            Furama resort
        </a>
    </div>
</nav>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <div class="collapse navbar-collapse col-lg-9 "  id="navbarScroll">

            <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;width: 100%">

                <li class="nav-item dropdown"style="margin: 0px 35px">
                    <a class="nav-link dropdown-toggle" href="3" id="navbarDropdown1" role="button" data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false">
                        Home
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="#"></a>
                        <a class="dropdown-item" href="#"></a>
                        <a class="dropdown-item" href="#"></a>
                    </div>
                    </a>
                </li>
                <li class="nav-item dropdown"style="margin: 0px 35px">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown2" role="button" data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false">
                        Employee
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="#"> </a>
                        <a class="dropdown-item" href="#"></a>

                    </div>
                    </a>
                </li>
                <li class="nav-item dropdown"style="margin: 0px 35px">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown3" role="button" data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false">
                        Customer
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="#"></a>
                        <a class="dropdown-item" href="#"></a>

                    </div>
                    </a>
                </li>
                <li class="nav-item dropdown"style="margin: 0px 35px">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown4" role="button" data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false">
                        Service
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="#"></a>
                        <a class="dropdown-item" href="#"></a>
                        <a class="dropdown-item" href="#"></a>

                    </div>
                    </a>
                </li>
                <li class="nav-item dropdown"style="margin: 0px 35px">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown5" role="button" data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false">
                        contract
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="#"></a>
                        <a class="dropdown-item" href="#"></a>
                        <a class="dropdown-item" href="#"></a>

                    </div>
                    </a>
                </li>

            </ul>
        </div>

        <div class="col-lg-3">

            <form class="d-flex " >
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <span><button class="btn btn-outline-success" type="submit">Search</button></span>
            </form>

        </div>
    </div>
</nav>
<div class="container-fluid" style="top:0"  >
    <div class="col-lg-3" style="background: #8fd19e;min-height: 500px;height: 500px;">
        <div style="top:0">
            <ul style="list-style: none;" >
                <li style="margin-bottom: 20px ;padding-top: 40px"><a class="dropdown-item" href="#">Regular link</a></li>
                <li style="margin-bottom: 20px"><a class="dropdown-item" href="#" aria-current="true">Active link</a></li>
                <li style="margin-bottom: 20px"><a class="dropdown-item" href="#">Another link</a></li>
            </ul>
        </div>
    </div>
    <div class="col-lg-9">

    </div>
</div>
<div class="container-fluid">
    <div style="background: black ;width: 100%;height: 70px">
        <div style="height: 50px;line-height: 70px">
            <p style="color: white ;text-align: center">Furama resort is pleased to serve. FuramaResortDaNang@gmail.com </p>
        </div>

    </div>
</div>

</body>
</html>
