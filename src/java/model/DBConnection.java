package model;

import jakarta.resource.cci.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnection {
    private static Connection c;
    private final static String DATABASE = "exon";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "1234";
    public static Connection createConnection;
    
    
    private static Connection connection;
    
    private static void init()throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+DATABASE,USERNAME ,PASSWORD );
    }
    
    public static void iud(String sql)throws Exception{
        if(connection == null){
            init();
        }
        connection.createStatement().executeUpdate(sql);
    }
    
    public static ResultSet search(String sql)throws Exception{
        if(connection == null){
            init();
        }
        return (ResultSet) connection.createStatement().executeQuery(sql);              
    }
    
//    public static void main(String[] args) {
//        try {
//            iud("INSERT INTO cheque(cheque_id,amount) VALUES('1234','5000.00')");
//            System.out.println("done");
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
 
}
