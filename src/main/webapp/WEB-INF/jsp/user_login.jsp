<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login</title>

    <c:set var="basePath" value="${pageContext.request.contextPath}"></c:set>
    
    <!-- Bootstrap -->
    <link href="${basePath}/static/css/bootstrap.min.css" rel="stylesheet">
    
    <link href="${basePath}/static/css/login.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
  </head>
  <body>
    <div class="container container-fluid container-login">
        <div class="row">
            <div class="col-sm-9">
                <div class="jumbotron">
                    <h1>问卷系统</h1>
                    <p>这是南通大学的调查往届生就业问题的问卷调查系统.</p>
                </div>
            </div>
            <div class="col-sm-3">
                <form class="form-signin" action="${basePath}/login" method="POST" >
                    <h2 class="form-signin-heading">登录</h2>
                    <label for="inputUserName" class="sr-only">用户名</label>
                    <input type="text" id="inputUserName" class="form-control" placeholder="用户名" required autofocus name="userName"/>
                    <form:errors path="userName"/>
                    <label for="inputPassword" class="sr-only">密码</label>
                    <input type="password" id="inputPassword" class="form-control" placeholder="密码" required name="password"/>
                    <form:errors path="password"/>
                    <div class="checkbox">
                        <label>
                        <input type="checkbox" value="remember-me">记住我</label>
                    </div>
                    <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
                </form>
            </div>
        </div>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="${basePath}/static/js/jquery.min.js"></script>
    
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${basePath}/static/js/bootstrap.min.js"></script>
    
  </body>
</html>
