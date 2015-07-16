package com.travelsky.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.travelsky.bean.Account;
import com.travelsky.biz.AccountService;
import com.travelsky.dao.AccountMapper;
import com.travelsky.plugin.mybatis.plugin.PageView;

@Transactional
@Service("accountService")
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountMapper accountMapper;

	 public PageView query(PageView pageView, Account account) {
	 Map<String, Object> map = new HashMap<String, Object>();
	 map.put("paging", pageView);
	 map.put("t", account);
	 List<Account> list = accountMapper.query(map);
	 pageView.setRecords(list);
	 return pageView;
	 }

	 public PageView queryNoMatch(Account account,PageView pageView) {
	 Map<String, Object> map = new HashMap<String, Object>();
	 map.put("paging", pageView);
	 map.put("t", account);
	 List<Account> list = accountMapper.queryNoMatch(map);
	 pageView.setRecords(list);
	 return pageView;
	 }

	public List<Account> queryAll(Account t) {
		// TODO Auto-generated method stub
		return accountMapper.queryAll(t);
	}

	public void delete(String id) throws Exception {
		accountMapper.delete(id);
	}

	public void update(Account t) throws Exception {
		accountMapper.update(t);
	}

	public Account getById(String id) {
		return accountMapper.getById(id);
	}

	public void add(Account t) throws Exception {
		accountMapper.add(t);
	}

	public Account querySingleAccount(String accountName) {
		return accountMapper.querySingleAccount(accountName);
	}

	public Account isExist(String accountName) {
		return accountMapper.isExist(accountName);
	}

	public Account countAccount(Account account) {
		return accountMapper.countAccount(account);
	}

}
