package com.rest.api.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rest.api.object.EmployeeShow;
import com.rest.api.service.DataService;

@Controller
public class PageController {
	
	@Inject
	DataService dService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Home(){
		return "home";
	}
	
	@RequestMapping(value = "/manage", method = RequestMethod.GET)
	public ModelAndView Manage(HttpServletRequest req){
		HttpSession Session = req.getSession();
		int Permition = (Integer)Session.getAttribute("Permition");
		
		ModelAndView view = new ModelAndView();
		view.setViewName("logined");
		view.addObject("JSESSIONID",Session.getId());
		view.addObject("level",Permition);
		
		return view;
	}
	
	@RequestMapping(value = "/qr", method = RequestMethod.GET)
	public ModelAndView Search(@RequestParam(defaultValue="")int n) throws Exception{
		EmployeeShow vo = dService.GetUserInfo(n);
		ModelAndView view = new ModelAndView();
		if(vo == null) {
			view.setViewName("search");
			view.addObject("item", vo);
		}else {
			view.setViewName("search");
			view.addObject("item", vo);
		}
		
		return view;
	}
}
