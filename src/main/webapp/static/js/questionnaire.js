$(function(){
	
	$('#questionnairePage').removeClass().addClass("active");

	$('#startdate').datetimepicker({
		format : 'yyyy-mm-dd hh:ii',
		weekStart : 1,
		todayBtn : 1,
		autoclose : 1,
		todayHighlight : 1,
		startView : 2,
		maxView : 3,
		forceParse : 1,
		language : 'zh-CN'
	});

	$('#enddate').datetimepicker({
		format : 'yyyy-mm-dd hh:ii',
		weekStart : 1,
		todayBtn : 1,
		autoclose : 1,
		todayHighlight : 1,
		startView : 2,
		maxView : 3,
		forceParse : 1,
		language : 'zh-CN'
	});

	$('#startdate').click(function() {
		$('#startdate').datetimepicker('show');
	});

	$('#enddate').click(function() {
		$('#enddate').datetimepicker('show');
	});
})