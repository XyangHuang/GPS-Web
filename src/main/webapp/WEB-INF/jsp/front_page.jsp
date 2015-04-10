<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>header</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>footer</title>

<c:set var="basePath" value="${pageContext.request.contextPath}"></c:set>

<!-- Bootstrap -->
<link href="${basePath}/static/css/bootstrap.min.css" rel="stylesheet">
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<div class="container">
		<%@ include file="header.jsp" %>

		<div class="jumbotron">
			<h1>问卷系统</h1>
			<p>这是南通大学的调查往届生就业问题的问卷调查系统.</p>
		</div>

        <%@ include file="footer.jsp" %>
	</div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="${basePath}/static/js/jquery.min.js"></script>

	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="${basePath}/static/js/bootstrap.min.js"></script>

    <script src="${basePath}/static/js/header.js"></script>

	<script type="text/javascript">
		$(function() {
			$('#frontPage').removeClass().addClass("active");
		});
	</script>
</body>
</html>