package com.zensar.plm.connection;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * Connect
 */
public class Connect {

    public static Connection getConnection() {
        Connection connection = null;
        try {
            FileReader fReader = new FileReader("config.properties");
            Properties properties = new Properties();
            properties.load(fReader);

            Class.forName(properties.getProperty("driver"));

            connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"),
                    properties.getProperty("password"));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}