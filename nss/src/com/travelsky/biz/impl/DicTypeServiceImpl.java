package com.travelsky.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.travelsky.bean.DicType;
import com.travelsky.biz.DicTypeService;
import com.travelsky.dao.DicTypeMapper;
import com.travelsky.plugin.mybatis.plugin.PageView;


@Transactional
@Service("dicTypeService")
public class DicTypeServiceImpl implements DicTypeService {
	@Autowired
	private DicTypeMapper dicTypeMapper;

	public PageView query(PageView pageView, DicType dicType) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("paging", pageView);
		map.put("t", dicType);
		List<DicType> list = dicTypeMapper.query(map);
		pageView.setRecords(list);
		return pageView;
	}

	public void add(DicType dicType) throws Exception {
		dicTypeMapper.add(dicType);
	}

	public void delete(String id) throws Exception {
		dicTypeMapper.delete(id);
	}

	public DicType getById(String id) {
		return dicTypeMapper.getById(id);
	}

	public void update(DicType dicType) throws Exception {
		dicTypeMapper.update(dicType);
	}

	public List<DicType> queryAll(DicType dicType) {
		return dicTypeMapper.queryAll(dicType);
	}

	public DicType queryById(DicType dicType) {
		return dicTypeMapper.queryById(dicType);
	}
	public DicType isExist(DicType dicType) {
		return dicTypeMapper.isExist(dicType);
	}

}
