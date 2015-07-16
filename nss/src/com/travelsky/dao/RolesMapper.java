package com.travelsky.dao;

import com.travelsky.base.BaseMapper;
import com.travelsky.bean.RoleAccount;
import com.travelsky.bean.Roles;


public interface RolesMapper extends BaseMapper<Roles>{
	public Roles isExist(String name);
	
	public Roles findbyAccountRole(String accountId);
	
	public void addAccRole(RoleAccount roleAccount);
	
	public void deleteAccountRole(String accountId);
}
