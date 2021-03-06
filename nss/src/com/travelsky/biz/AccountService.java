package com.travelsky.biz;

import com.travelsky.base.BaseService;
import com.travelsky.bean.Account;




public interface AccountService extends BaseService<Account>{
	public Account querySingleAccount(String accountName);
	public Account isExist(String accountName);
	/**
	 * 验证用户登陆
	 * @author lanyuan
	 * Email：mmm333zzz520@163.com
	 * date：2014-2-25
	 * @param Account account
	 * @return
	 */
	public Account countAccount(Account account);
	
	/**
	 * @param account
	 * @param pageView
	 * @return
	 */
//	public PageView queryNoMatch(Account account,PageView pageView);
}
