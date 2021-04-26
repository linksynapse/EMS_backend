package com.rest.api.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.rest.api.object.*;

public class AuthInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse response, Object handler) throws Exception {
		
		WebAccount vo = null;
		
		try 
		{
			HttpSession Session = req.getSession();
			vo = (WebAccount)Session.getAttribute("UserProfile");
			
			if(vo != null) {
				return true;
			} else {
				throw new Exception("Require Login");
			}
		}
		catch(Exception e)
		{
			ModelAndView modelAndView = new ModelAndView("redirect:/");
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