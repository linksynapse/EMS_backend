package com.rest.api.service;

import java.util.Map;

import com.rest.api.object.Account;

public interface AuthServiceIface {
	public Map<String, Object> SignIn(Account account) throws Exception;
	public Map<String, Object> GetCompany() throws Exception;
}
