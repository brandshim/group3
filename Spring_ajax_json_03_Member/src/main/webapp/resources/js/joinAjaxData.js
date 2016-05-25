var ajaxPostSend =  function() {
	
	parent.startLayer();
	var url = "joinAjax.htm";
	var postString = "";
	postString   = "user_id=" + $('#user_id').val();
	postString += "&user_pwd=" + $('#user_pwd').val();
	postString += "&user_name=" + $('#user_name').val();
	postString += "&user_email=" + $('#user_email').val();
    
	$.ajax({

		type: "POST",
		url: url,
		data: postString,
		success: function(msg) {
			setTimeout('parent.stopLayer('+msg+')',2500);
	   }
	});
	
 };