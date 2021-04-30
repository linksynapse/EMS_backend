package com.rest.api.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rest.api.object.Account;
import com.rest.api.service.AuthService;

@Controller
public class AccountController {
	
	@Inject
	AuthService aService;
	
	@RequestMapping(value = "/authentification/login", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> Login(Account account, HttpServletRequest req) throws Exception{
		Map<String, Object> r = aService.SignIn(account);
		
		HttpSession Session = req.getSession();
		if(Integer.valueOf(r.get("return").toString()) == 0) {
			@SuppressWarnings("unchecked")
			ArrayList<Map<String, Object>> dataArray = (ArrayList<Map<String, Object>>)r.get("data");
			int Permition = Integer.valueOf(dataArray.get(0).get("permition").toString());
			
			Session.setAttribute("Permition", Permition);
			Session.setAttribute("IsAlived", true);
		}else {
			Session.setAttribute("Permition", 999);
			Session.setAttribute("IsAlived", false);
		}
		
		return r;
	}
	
	@RequestMapping(value = "/authentification/logout", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> Logout(HttpServletRequest req) throws Exception{
		
		req.getSession().invalidate();
		
		Map<String, Object> r = new HashMap<String, Object>();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("msg", "logout successfully");
		
		ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
		dataArray.add(data);
		
		r.put("return", 0);
		r.put("data", dataArray);
		
		return r;
	}
}
