package main.java.Spring_Lesson1.conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConection {
    private static DatabaseConection instance;
    private Connection connection;
    private  String url="jdbc:mysql://localhost:3306/quanlysach";
    private String userName="root";
    private  String password="0945533162";
    private  DatabaseConection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection= DriverManager.getConnection(url,userName,password);
        } catch (Exception e) {
            System.out.println("Database Connection Creation fail: "+e.getMessage());
        }
    }

      public Connection getConnection(){
        return connection;
      }
public  static DatabaseConection getInstan() throws SQLException {
        if(instance==null){
            instance= new DatabaseConection();
        }else if(instance.getConnection().isClosed()){
            instance=new DatabaseConection();
        }
        return instance;
}

}
