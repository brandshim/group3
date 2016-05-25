package ncontrollers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.View;

import vo.Member;
import vo.Notice;
import dao.MemberDao;
import dao.NoticeDao;

@Controller
@RequestMapping("/joinus/") //   /joinus/join.htm
public class JoinController {
  
	@Autowired
	private SqlSession SqlSession;
	@Autowired
	private View jsonview;
	
	@RequestMapping(value="join.htm" , method=RequestMethod.GET)
	public String join(){
		System.out.println("회원가입 페이지 요청");
		
		//이전
		//return "join.jsp";
		
		//Tiles
		return "joinus.join"; //{1}.{2}
	}
	
	/*@RequestMapping(value="join.htm" , method=RequestMethod.POST)
	public String join(Member member) throws ClassNotFoundException, SQLException{
		//가입처리 (DAO 단)
		System.out.println("회원가입");
		System.out.println(member.toString());
		memberDao.insert(member);
		return "redirect:../index.htm"; //수정 요망(주의 사항)
	}*/
	
	//login page
	@RequestMapping(value="login.htm" , method=RequestMethod.GET)
	public String login(){
		return "joinus.login";
	}
	
	@RequestMapping(value="testJson.htm",method=RequestMethod.POST)
	public View testJson(String userid , ModelMap map) throws ClassNotFoundException, SQLException{
	    System.out.println("이거 타니?");
		MemberDao memberdao = SqlSession.getMapper(MemberDao.class);
		System.out.println("이거 타니?" + memberdao);
		List<Member> member = memberdao.getMember(userid);
	    System.out.println(member);
        int result = 0;
        
        if(userid.equals(((Member) member).getUserid())){
            result=1;
        }else{
            result=0;
        }
        map.addAttribute("result",result);
		return jsonview;
		
	}
}
