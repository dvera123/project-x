$(document).ready(function(){
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
	
});