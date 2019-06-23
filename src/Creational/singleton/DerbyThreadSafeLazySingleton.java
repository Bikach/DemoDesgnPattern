package Creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DerbyThreadSafeLazySingleton {

    private static volatile DerbyThreadSafeLazySingleton instance = null;
    private static volatile Connection conn = null;

    private DerbyThreadSafeLazySingleton(){
        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(conn != null) {
            throw new RuntimeException("Use getConnection() method to create");
        }

        if(instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    static DerbyThreadSafeLazySingleton getInstance(){
        if  (instance == null) {
            synchronized (DerbyThreadSafeLazySingleton.class){
                if  (instance == null) instance = new DerbyThreadSafeLazySingleton();
            }
        }
        return instance;
    }

     Connection getConnection() {
        if(conn == null) {
            synchronized (DerbyThreadSafeLazySingleton.class) {
                if(conn == null) {
                    try {
                        String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";

                        conn = DriverManager.getConnection(dbUrl);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return conn;
    }
}

