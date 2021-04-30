package com.rest.api.datahandler;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.rest.api.object.Account;

@Repository
public class AccountHandler implements AccountHandlerIface{

	@Inject
	private SqlSession sql;
	
	@Override
	public Account Signin(Account account) {
		return sql.selectOne("Login._0001", account);
	}
}
