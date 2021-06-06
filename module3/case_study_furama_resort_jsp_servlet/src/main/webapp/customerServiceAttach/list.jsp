<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/30/2021
  Time: 3:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <style>
        * {
            border: 0px;
            margin: 0px;
            padding: 0px;
        }

        table td {
            border: 1px solid black;
        }

        table th {
            border: 1px solid black;
        }

    </style>
</head>
<body>
<nav class="navbar navbar-light bg-light">
    <div class="container-fluid">
        <div style="text-align: center ;width: 100%">
            <a class="navbar-brand " href="#">
                <img src="../img/FURAMA.png"
                     alt="" width="350px" height="150px" class="d-inline-block align-text-top ">
            </a>
        </div>
    </div>
</nav>
<div class="container-fluid d-flex" style="margin-top: 20px">
    <div class="col-lg-9">
        <div style="background: #34ce57 ;width: 150px;height: 40px;border-radius:50px ">
            <a style="text-decoration: none;color: white" href="/employee?action=create">
                <p style="width: 100%;height: 100%;line-height: 40px;text-align: center">Add Employee</p></a>
        </div>
    </div>
    <div class="col-lg-3">
        <form class="d-flex " method="post" action="/employee?action=search">
            <input class="form-control me-2" name="name" type="search" placeholder="Search" aria-label="Search">
            <span><button class="btn btn-outline-success" type="submit">Search</button></span>
        </form>

    </div>

</div>
<div class="container-fluid" style="margin-top: 20px">
    <table id="tableEmployee" class="table table-striped table-bordered" >
        <thead>
        <tr style="background: #218838">

            <th colspan="11" scope="row"><h3 style="text-align: center">List Employee</h3></th>


        </tr>

        <tr>
            <th>Name Customer</th>
            <th>Start Date</th>
            <th>End Date</th>
            <th>Name Service</th>
            <th>Id Contract</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${customerServiceList}" var="customerService" varStatus="status">
            <tr>
                <td>${customerService.nameCustomer}</td>
                <td>${customerService.startDate}</td>
                <td>${customerService.endDate}</td>
                <td>${customerService.nameService}</td>
                <td>${customerService.idContract}</td>
            </tr>

        </c:forEach>
        </tbody>
    </table>
</div>

<div class="container-fluid ">
    <div style="background: black ;width: 100%;height: 70px ;margin-top: 20px">
        <div style="height: 50px;line-height: 70px">
            <p style="color: white ;text-align: center">Furama resort is pleased to serve.
                FuramaResortDaNang@gmail.com </p>
        </div>

    </div>
</div>
</body>
</html>

