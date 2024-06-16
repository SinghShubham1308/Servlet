package com.servlet.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CommonUtil {
	private static final Logger logger = LogManager.getLogger(CommonUtil.class);
	private static final String PROPERTYFILEPATH_STRING = "/Users/prashantsingh/Downloads/apache-tomcat-9.0.89/webapps/ROOT/WEB-INF/conf/Servlet.properties";

	public static Properties getPropertyFile() {
		logger.info("[CommonUtil][getPropertyFile] connecting ...... to the properties file");
		System.out.println("[CommonUtil][getPropertyFile] connecting ...... to the properties file");
		Properties properties = new Properties();
		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream(PROPERTYFILEPATH_STRING);
			properties.load(fileInputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("[CommonUtil][getPropertyFile] connnection Faile!");
			System.out.println("[CommonUtil][getPropertyFile] connnection Faile!");
		}
		return properties;
	}
}
