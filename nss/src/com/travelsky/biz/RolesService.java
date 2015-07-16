package com.travelsky.biz;


import java.util.List;

import com.travelsky.base.BaseService;
import com.travelsky.bean.RoleAccount;
import com.travelsky.bean.Roles;


public interface RolesService extends BaseService<Roles>{
	public Roles isExist(String name);
	public Roles findbyAccountRole(String accountId);
	public void addAccRole(RoleAccount roleAccount);

	public void addAccRole(String accountId, List<String> ids);
}
