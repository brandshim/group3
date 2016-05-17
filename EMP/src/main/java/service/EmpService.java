package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import DAO.EMPDAO;
import DTO.EMP;

@Service
public class EmpService {
	@Autowired
	private SqlSession sqlsession;
	
	public String write(EMP dto) {

		EMPDAO empDao = sqlsession.getMapper(EMPDAO.class);

		empDao.insertEMP(dto);

		return "redirect:/getAllList.htm";
	}
	
	public List<EMP> list() {

		EMPDAO empDao = sqlsession.getMapper(EMPDAO.class);
		List<EMP> list = empDao.getAllList();

		

		return list;
	}
	
	
	public EMP read(int empno) {

		EMPDAO empDao = sqlsession.getMapper(EMPDAO.class);

		EMP dto = empDao.getEMP(empno);

		
		return dto;
	}
	
	
	public String delete(int empno) {

		EMPDAO empDao = sqlsession.getMapper(EMPDAO.class);

		empDao.delEMP(empno);

		return "redirect:/getAllList.htm";
	}
	
	public EMP update(int empno) {
	
		EMPDAO empDao = sqlsession.getMapper(EMPDAO.class);

		EMP dto = empDao.getEMP(empno);

		

		return dto;
	}
	
	
	public String updateok(EMP emp) {

		EMPDAO empDao = sqlsession.getMapper(EMPDAO.class);

		empDao.updateEMP(emp);


		return "redirect:/read.htm";
	}
}
