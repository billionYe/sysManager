package com.travelsky.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.travelsky.bean.UserLogin;
import com.travelsky.biz.UserLoginService;
import com.travelsky.dao.UserLoginMapper;
import com.travelsky.plugin.mybatis.plugin.PageView;



@Transactional
@Service("userLoginService")
public class UserLoginServiceImpl implements UserLoginService {
	@Autowired
	private UserLoginMapper userLoginMap;

	public PageView query(PageView pageView, UserLogin userLogin) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("paging", pageView);
		map.put("t", userLogin);
		List<UserLogin> list = userLoginMap.query(map);
		pageView.setRecords(list);
		return pageView;
	}

	public List<UserLogin> queryAll(UserLogin t) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void update(UserLogin t) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public UserLogin getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void add(UserLogin t) throws Exception {
		userLoginMap.add(t);
		// TODO Auto-generated method stub
		
	}
	

}
