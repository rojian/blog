<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
<head>
    <%--标题栏显示logo--%>
    <%--<link rel="icon" href="../assets/img/favicon.ico" type="image/x-icon">--%>
    <link rel="shortcut icon" href="../assets/img/favicon.ico" type="image/x-icon">
    <meta charset="utf-8">
    <title>主页</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width">

    <!-- Bootstrap styles -->
    <link rel="stylesheet" href="../assets/css/bootstrap.min.css">

    <!-- Font-Awesome -->
    <link rel="stylesheet" href="../assets/css/font-awesome/css/font-awesome.min.css">

    <!-- Google Webfonts -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,600|PT+Serif:400,400italic' rel='stylesheet'
          type='text/css'>

    <!-- Styles -->
    <link rel="stylesheet" href="../assets/css/style.css" id="theme-styles">

    <!--[if lt IE 9]>
    <script src="../assets/js/vendor/google/html5-3.6-respond-1.1.0.min.js"></script>
    <![endif]-->

</head>
<body>
<header>
    <tiles:insertAttribute name="header" />
</header>

<div class="widewrapper main">
    <div class="container">
        <div class="row">
            <tiles:insertAttribute name="l-content" />
            <tiles:insertAttribute name="r-content" />
        </div>
    </div>
</div>

<footer>
    <tiles:insertAttribute name="footer" />
</footer>

<script src="../assets/js/jquery.min.js"></script>
<script src="../assets/js/bootstrap.min.js"></script>
<script src="../assets/js/modernizr.js"></script>

</body>
</html>