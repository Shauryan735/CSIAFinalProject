package employee.payroll.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String DB_NAME = "attendance_system";
    public static final String USER = "root";
    public static final String PASS = "";
    public static final String URL = "jdbc:mysql://localhost/";
    public static Connection connect() {
        //replace next three lines with your code!
        
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL+DB_NAME,USER,PASS);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
