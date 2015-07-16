package com.travelsky.biz;

import com.travelsky.base.BaseService;
import com.travelsky.bean.Dic;




public interface DicService extends BaseService<Dic>{
	public Dic isExist(Dic dic);
}
