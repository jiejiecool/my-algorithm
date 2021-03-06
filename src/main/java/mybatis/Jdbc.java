package mybatis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.0.107:3306/test?characterEncoding=utf-8&allowPublicKeyRetrieval=true", "root", "root");
        System.out.println(connection);

        
    }
}
