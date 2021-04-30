package com.rest.api.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse response, Object handler) throws Exception {
		try 
		{
			HttpSession Session = req.getSession();
			
			if(Session.getAttribute("IsAlived") != null || (Boolean)Session.getAttribute("IsAlived")) {
				if(Integer.valueOf(Session.getAttribute("Permition").toString()) < 2) {
					return true;
				}else {
					System.out.println("==========Permition Deny==========");
					System.out.println("IsAlived : " + Session.getAttribute("IsAlived").toString());
					System.out.println("Permition : " + Session.getAttribute("Permition").toString());
					
					throw new Exception("Require Permition");
				}
			} else {
				System.out.println("==========Session Deny==========");
				throw new Exception("Require Login");
			}
		}
		catch(Exception e)
		{
			HttpSession Session = req.getSession();
			System.out.println("==========Session Deny==========");
			System.out.println(e.toString());
			ModelAndView modelAndView = new ModelAndView("redirect:/error/requireLogin");
            throw new ModelAndViewDefiningException(modelAndView);
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}
	
}