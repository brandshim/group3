function idCheck()
{
	var reg_id = /^[a-z0-9_-]{8,12}$/;
	var id = $('#user_id');
	if(!reg_id.test(id.val()) == true)
	{
		$('#idCheckTD').text("아이디는 8-12자 이여야 하며 \n"
				+ "마침표,'-', '_'를 제외한 문자는 사용하실수 없습니다.");
	}else{
		$('#idCheckTD').text("사용하실수 있는 아이디 입니다.");
	}
}
function passwordCheck()
{
	if($('#user_pwd').val() != $('#user_pwdok').val())
	{
		$('#passwordCheckTD').text("비밀번호가 일치하지 않습니다.");
	}
	else if($('#user_pwd').val() == $('#user_pwdok').val())
	{
		$('#passwordCheckTD').text("비밀번호가 일치합니다.");
	}
}
function emailCheck()
{
	var reg_email = /^[a-z0-9_+.-]+@([a-z0-9-]+\.)+[a-z0-9]{2,4}$/;
	var email= $('#user_email');
	if(!reg_email.test(email.val())==true){
		$('#emailCheckTD').text("이메일 주소는 @와.를  입력해 주셔야 합니다 ex)park@naver.com");
	}else{
		$('#emailCheckTD').text("형식에 맞는 이메일 입니다.");
	}
}
