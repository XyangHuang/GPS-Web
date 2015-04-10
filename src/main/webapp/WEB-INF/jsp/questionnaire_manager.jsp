<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>questionnaire</title>
<c:set var="basePath" value="${pageContext.request.contextPath}"></c:set>
<!-- Bootstrap -->
<link href="${basePath}/static/css/bootstrap.min.css" rel="stylesheet">
    <!-- Bootstrap datetimepicker -->
    <link href="${basePath}/static/css/bootstrap-datetimepicker.min.css" rel="stylesheet">
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
    <div class="container">
        <jsp:include page="header.jsp" flush="false"></jsp:include>

        <ol class="breadcrumb">
            <li><a href="#">Home</a></li>
            <li class="active">问卷</li>
        </ol>
        
        <div class="panel panel-default">
            <div class="panel-body">
                <form class="form-inline" role="form">
                <div class="form-group">
                        <label for="name">开始日期</label> <input type="text"
                            class="form-control" id="startdate" readonly placeholder="开始日期" />
                    </div>

                    <div class="form-group">
                        <label for="name">结束日期</label> <input type="text"
                            class="form-control" id="enddate" readonly placeholder="结束日期" />
                    </div>

                    <div class="form-group">
                        <label for="name">问卷名</label> <input type="text"
                            class="form-control" id="name" placeholder="问卷名" />
                    </div>

                    <button type="submit" class="btn btn-primary">提交</button>

                    <div class="form-group pull-right">
                        <button type="button" class="form-control btn-primary"
                            id="addquestionnire">新建问卷</button>
                    </div>
                </form>
            </div>
        </div>

        <table class="table table-bordered  table-hover">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>问卷名</th>
                    <th>开始时间</th>
                    <th>结束时间</th>
                    <th>操作</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach begin="1" end="10" step="1">
                    <tr>
                        <td>Tanmay</td>
                        <td>Bangalore</td>
                        <td>560001</td>
                        <td>560001</td>
                        <td><a href="#">edit</a> <a href="#">delete</a> <a href="#">results</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

        <!--分页 -->
        <div class="clearfix">
            <ul class="pagination pull-right">
                <li><a href="#">&laquo;</a></li>
                <li class="active"><a href="#">1</a></li>
                <li class="disabled"><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
                <li><a href="#">&raquo;</a></li>
            </ul>
        </div>
        <jsp:include page="footer.jsp" flush="false"></jsp:include>
        
    </div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="${basePath}/static/js/jquery.min.js"></script>

    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${basePath}/static/js/bootstrap.min.js"></script>
    <script src="${basePath}/static/js/bootstrap-datetimepicker.min.js"></script>
    <script src="${basePath}/static/js/bootstrap-datetimepicker.zh-CN.js"></script>

    <script src="${basePath}/static/js/questionnaire.js"></script>
</body>
</html>