package com.travelsky.biz;

import com.travelsky.base.BaseService;
import com.travelsky.bean.DicType;




public interface DicTypeService extends BaseService<DicType>{
	public DicType isExist(DicType dicType);
	public DicType queryById(DicType dicType);
}
