package com.travelsky.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.DeviceResolver;

public class MobileDeviceResolver implements DeviceResolver{
	public MobileDeviceResolver(List l){
		for(Object o:l){
			System.out.println("MobileDeviceResolver  constructor  run");
			System.out.println(o);
		}
	}
	@Override
	public Device resolveDevice(HttpServletRequest request) {
		String agent=request.getHeader("User-Agent");
		return null;
	}

}
