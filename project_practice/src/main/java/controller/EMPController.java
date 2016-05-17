package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import DAO.EMPDAO;
import DTO.EMP;
import service.EmpService;

@Controller
public class EMPController {

	@Autowired
	private EmpService empservice;

	@RequestMapping("/writeform.htm")
	public String writeForm() {
		return "emp.writeform";

	}

	@RequestMapping("/write.htm")
	public String write(EMP dto) {

		return empservice.write(dto);
	}

	@RequestMapping("/getAllList.htm")
	public String list(Model model) {

		List<EMP> list = empservice.list();

		model.addAttribute("list", list);

		return "emp.list";
	}

	@RequestMapping("/read.htm")
	public String read(int empno, Model model) {

		EMP dto = empservice.read(empno);
		

		model.addAttribute("b", dto);
		return "emp.read";
	}

	@RequestMapping("/update.htm")
	public String update(int empno, Model model) {
		System.out.println(empno);
		model.addAttribute("b",empservice.update(empno));
		return "emp.updateform";
	}

	@RequestMapping("/updateok.htm")
	public String updateok(EMP emp, Model model) {

		empservice.updateok(emp);

		model.addAttribute("empno", emp.getEmpno());

		return "redirect:/read.htm";
	}

	@RequestMapping("/delete.htm")
	public String delete(int empno, Model model) {

		return empservice.delete(empno);
	}
	
	@RequestMapping("/search.htm")
	public String search(int empno, Model model) {

		EMP dto = empservice.read(empno);
		

		model.addAttribute("b", dto);
		return "emp.read";
	}

}
