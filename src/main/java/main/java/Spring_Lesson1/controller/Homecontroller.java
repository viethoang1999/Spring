package main.java.Spring_Lesson1.controller;

import main.java.Spring_Lesson1.Model.User;
import main.java.Spring_Lesson1.conection.DatabaseConection;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@RestController
@RequestMapping(value = "/home")
public class Homecontroller {
    @PostMapping(value = "/register")
    public String getRegister(){

    }
 @RequestMapping(value = "/Login")
 public class  Login{
        @PostMapping(value = "/Login")
     public String getLogin(@RequestBody User user) throws SQLException {
            DatabaseConection conection= DatabaseConection.getInstan();
            Connection con= conection.getConnection();
            String sql="selec * from User";
            Statement statement=con.createStatement();
            ResultSet rs=statement.executeQuery(sql);
            while(rs.next()){
                if(user.checkEmail().equals(rs.getString("email")))
            }
            
        }
 }
}
