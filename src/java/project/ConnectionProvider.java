
package project;

import java.sql.*;
public class ConnectionProvider {
   static Connection con;
public static Connection getCon()
{
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
          
          String  user="root";
        String password="dell@123";
        String url="jdbc:mysql://localhost:3306/ospjsp";
           con=DriverManager.getConnection(url,user,password);
          return con;
    }catch(ClassNotFoundException | SQLException e)
    {
        System.out.print(e);
        return null;
    }
}
}

 
