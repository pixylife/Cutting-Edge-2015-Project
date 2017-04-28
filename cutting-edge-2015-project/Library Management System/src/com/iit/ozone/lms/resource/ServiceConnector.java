/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iit.ozone.lms.resource;
/**
 *
 * @author Sahan Thinusha
 */
public class ServiceConnector {
	private final static String ip="localhost";
	private final static String port="8080";
	private final static String service="/LMS_WebService_v1.00/webresources/";
	
	
	public static String getIp() {
		return ip;
	}
	public static String getPort() {
		return port;
	}
	public static String getService() {
		return service;
	}
	
}
