package com.blog.web.ajax;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.blog.mybatis.UserDaoImpl;
import com.blog.vo.UserVo;

@Controller
public class joinResponseAjaxData {
	
	private static final Logger logger = LoggerFactory.getLogger(joinResponseAjaxData.class);
	
	@Resource(name="userDaoImpl")
	private UserDaoImpl userDaoImpl;
	
	@RequestMapping("joinAjax.htm")
	public ModelAndView main(HttpServletRequest request) {
		
		String result = "0";
		
		logger.info("User Join AjaxData");
		
		ModelAndView mav = new ModelAndView("main");
		mav.setViewName("ajax/joinAjaxData");
		
		String id = request.getParameter("user_id");
		String password = request.getParameter("user_pwd");
		String email = request.getParameter("user_email");
		String name = request.getParameter("user_name");
		
		UserVo userVo = new UserVo();
		userVo.setUser_id(id);
		userVo.setUser_pwd(password);
		userVo.setUser_name(name);
		userVo.setUser_email(email);
		
		System.out.println(userVo.getUser_id());
		
		int resultValue = 0; 
		
		try { resultValue = userDaoImpl.insertUser(userVo) ; } catch(Exception e) {}
		
		if (resultValue == 1) {
			result ="1";
		}
		mav.addObject("result", result);
		return mav; 
		
	}
}

