$(document).ready(function(){
	
	//ajax call add Test Case
	$('#testCase').submit(function(e){
		e.preventDefault();
		$.ajax({
			  type: 'POST',	
			  url: "save.do",
			  data: $('#testCase').serialize()
			}).done(function(content) {
				$('#myModal').modal('hide');  
				$('#testCaseList').html(content);
			});
		});
	
	//ajax call update Test Case
	$('#testCaseDetail').submit(function(e){
		e.preventDefault();
		$.ajax({
			  type: 'POST',	
			  url: "update.do",
			  data: $('#testCaseDetail').serialize()
			}).done(function(content) {});
		});
	
	
});

