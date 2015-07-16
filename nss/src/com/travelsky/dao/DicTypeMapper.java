package com.travelsky.dao;

import com.travelsky.base.BaseMapper;
import com.travelsky.bean.DicType;



public interface DicTypeMapper extends BaseMapper<DicType>{
	public DicType isExist(DicType dicType);
	public DicType queryById(DicType dicType);
}
