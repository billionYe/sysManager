package com.travelsky.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.travelsky.bean.Dic;
import com.travelsky.biz.DicService;
import com.travelsky.dao.DicMapper;
import com.travelsky.plugin.mybatis.plugin.PageView;


@Transactional
@Service("dicService")
public class DicServiceImpl implements DicService {
	@Autowired
	private DicMapper dicMapper;

	public PageView query(PageView pageView, Dic dic) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("paging", pageView);
		map.put("t", dic);
		List<Dic> list = dicMapper.query(map);
		pageView.setRecords(list);
		return pageView;
	}

	public void add(Dic dic) throws Exception {
		dicMapper.add(dic);
	}

	public void delete(String id) throws Exception {
		dicMapper.delete(id);
	}

	public Dic getById(String id) {
		return dicMapper.getById(id);
	}

	public void update(Dic dic) throws Exception {
		dicMapper.update(dic);
	}

	public List<Dic> queryAll(Dic dic) {
		return dicMapper.queryAll(dic);
	}

	public Dic isExist(Dic dic) {
		return dicMapper.isExist(dic);
	}

}