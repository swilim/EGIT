package com.igit.core.beans;

import java.io.Serializable;

/*
 * 
 */
public class Device extends BaseEntiy implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7125962368658155041L;
	
	private String deviceId;
	private String deviceType;
	private String deviceMsg;
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getDeviceMsg() {
		return deviceMsg;
	}
	public void setDeviceMsg(String deviceMsg) {
		this.deviceMsg = deviceMsg;
	}
	
	
}
