package com.travelsky.base;

import java.util.List;
import java.util.Map;



public interface BaseMapper<T> extends Base<T> {
	/**
	 * 返回分页后的数据
	 * @param List
	 * @param t
	 * @return
	 */
	public List<T> query(Map<String, Object> map);
}
