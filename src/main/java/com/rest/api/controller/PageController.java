package com.rest.api.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
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
}
