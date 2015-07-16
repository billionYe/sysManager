package com.travelsky.web.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.travelsky.bean.Log;
import com.travelsky.bean.Resources;
import com.travelsky.biz.LogService;
import com.travelsky.plugin.mybatis.plugin.PageView;
import com.travelsky.util.Common;


/**
 * 
 * @author lanyuan
 * 2013-11-19
 * @Email: mmm333zzz520@163.com
 * @version 1.0v
 */
@Controller
@RequestMapping("/background/log/")
public class LogController extends BaseController{
	@Resource
	private LogService logService;
	
	/**
	 * 查询客户登陆信息
	 * @param model
	 * @param log
	 * @param pageNow
	 * @return
	 */
	@ResponseBody
	@RequestMapping("query")
	public PageView queryUserLogin(Log log,String pageNow,String pagesize){
		pageView = logService.query(getPageView(pageNow,pagesize), log);
		return pageView;
	}
	@RequestMapping("list")
	public String list(Model model, Resources menu, String pageNow) {
		return Common.BACKGROUND_PATH+"/log/list";
	}
}
