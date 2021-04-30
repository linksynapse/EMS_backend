package com.rest.api.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.rest.api.datahandler.AccountHandler;
import com.rest.api.object.Account;

@Repository
public class AuthService implements AuthServiceIface{

	@Inject
	AccountHandler aHandler;
	
	@Override
	public Map<String, Object> SignIn(Account account) throws Exception{
		Map<String, Object> r = new HashMap<String, Object>();
		
		Account vo = aHandler.Signin(account);
		if(vo != null) {
			Map<String, Object> data = new HashMap<String, Object>();
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			switch(vo.getPermition()) {
			case 0:
			case 1:
				data.put("msg", "login successfully");
				data.put("permition", vo.getPermition());
				dataArray.add(data);
				
				r.put("return", 0);
				r.put("data", dataArray);
				break;
			default:
				data.put("msg", "permition deny");
				data.put("permition", 999);
				dataArray.add(data);
				
				r.put("return", -1);
				r.put("data", dataArray);
				break;
			}
		}else {
			Map<String, Object> data = new HashMap<String, Object>();
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			
			data.put("msg", "invalid account");
			dataArray.add(data);
			
			r.put("return", "-2");
			r.put("data", dataArray);
		}
		
		return r;
	}
	
	@Override
	public Map<String, Object> GetCompany() throws Exception{
		Map<String, Object> r = new HashMap<String, Object>();
		return r;
	}
}
