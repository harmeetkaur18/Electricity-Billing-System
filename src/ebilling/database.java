package ebilling;

import java.sql.*;

public class database {
    Connection connection;
    Statement statement;
   // PreparedStatement stmt;
    database(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bill_system","root","harmeet@123");
            statement = connection.createStatement();
      //      stmt= connection.prepareStatement("");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


