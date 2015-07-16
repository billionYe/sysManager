package com.travelsky.dao;

import java.util.List;
import java.util.Map;

import com.travelsky.base.BaseMapper;
import com.travelsky.bean.Account;


public interface AccountMapper extends BaseMapper<Account>{
	public Account querySingleAccount(String accountName);
	public Account isExist(String accountName);
	
	public Account countAccount(Account account);
	
	public List<Account> queryNoMatch(Map<String, Object> map);
}
