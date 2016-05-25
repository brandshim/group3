package dao;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import vo.Member;

public interface MemberDao {
	//회원정보 얻기
	public List <Member> getMember(String userid) throws ClassNotFoundException, SQLException;
	//회원가입
	public int insert(Member member) throws ClassNotFoundException, SQLException;
	
}
