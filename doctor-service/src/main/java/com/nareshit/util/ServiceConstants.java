package com.nareshit.util;

import java.util.Properties;

public class ServiceConstants {

	public static final String NOVEL_HEALTH_DATE_FORMAT = "novelhealth.date.format";
	
	public static final String SEARCH_DOCTOR_BY_NAME = "from Doctor doc where doc.fname like %"+":name"+"%";
	
	public static void main(String[] args) {
		System.out.println(System.getProperty("catalina.base"));
		System.out.println(System.getenv("CATALINA_HOME"));
		for(String key:System.getenv().keySet()) {
			System.out.println("key is:\t"+key);
		}
		Properties props = System.getProperties();
		for(Object key:props.keySet()) {
			//System.out.println("key is:\t"+key);
			//System.out.println("value is:\t"+props.get(key));
		}
	}
}