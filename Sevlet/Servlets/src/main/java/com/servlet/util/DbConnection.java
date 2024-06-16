package com.servlet.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DbConnection {
	private static final Logger logger = LogManager.getLogger(DbConnection.class);
	private static Properties properties;
	static {
        try {
            properties = CommonUtil.getPropertyFile();
            String jdbcDriver = properties.getProperty("jdbcDriver");
            logger.info("[DbConnection] driver "+jdbcDriver);
            System.out.println("[DbConnection] driver "+jdbcDriver);
            Class.forName(jdbcDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError("Failed to initialize DBConnectionManager");
        }
        
	}
	public static Connection getConnection() throws SQLException {
        String jdbcUrl = properties.getProperty("jdbcUrl");
        String jdbcUser = properties.getProperty("jdbcUser");
        String jdbcPassword = properties.getProperty("jdbcPassword");
        logger.info("[DbConnection][getConnection] URl "+jdbcUrl + " user "+jdbcUser);
        System.out.println("[DbConnection][getConnection] URl "+jdbcUrl + " user "+jdbcUser);
        return DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);
    }
}
