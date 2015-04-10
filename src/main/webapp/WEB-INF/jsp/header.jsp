<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Static navbar -->
<nav class="navbar navbar-fixed-top navbar-inverse">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">主导航开关</span> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">问卷系统</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="${pageContext.request.contextPath}">Home</a></li>
				<li><a href="#" id="about">About</a></li>
				<li><a href="#" id="contact">Contact</a></li>
			</ul>

			<ul class="nav navbar-nav navbar-right">
				<li><a href="#">欢迎您，</a></li>
				<li><a href="#">XXX</a></li>
				<li><a href="#">登出</a></li>
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
	<!--/.container-fluid -->
</nav>

<div class="clearfix" style="margin-top: 70px;">
	<ul class="nav nav-pills navbar-right">
		<li role="presentation" id="frontPage"><a
			href="${pageContext.request.contextPath}/front">首页</a></li>
		<li role="presentation" id="questionnairePage"><a
			href="${pageContext.request.contextPath}/questionnaire">问卷</a></li>
		<li role="presentation" id="studentsPage"><a href="#">学生</a></li>
		<li role="presentation" id="otherPage"><a href="#">其他</a></li>
	</ul>
</div>

<!-- about modal -->
<div class="modal fade" id="aboutmodal">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">
					<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
				</button>
				<h4 class="modal-title">About</h4>
			</div>
			<div class="modal-body">
				<p>南通大学毕业生就业问卷系统</p>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">知道了</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>
<!-- /.modal -->

<!-- contact modal -->
<div class="modal fade" id="contactmodal">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">
					<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
				</button>
				<h4 class="modal-title">Contact</h4>
			</div>
			<div class="modal-body">
				<p>南通大学：7474741</p>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">知道了</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>
<!-- /.modal -->

