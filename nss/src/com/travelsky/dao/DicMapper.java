package com.travelsky.dao;

import com.travelsky.base.BaseMapper;
import com.travelsky.bean.Dic;



public interface DicMapper extends BaseMapper<Dic>{
	public Dic isExist(Dic dic);
}
