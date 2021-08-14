package MyPackage;

import java.sql.*;
import javax.swing.*;
public class DBConnection
{   
   // private static String currentDir=System.getProperty("user.dir");
   // private static String url = "jdbc:derby:"+currentDir+"\\Tailor";  
    private static String url = "jdbc:derby://localhost:1527/Tailor";
    private static String username = "shoaib";   
    private static String password = "shoaib";
    private static Connection con=null;

    public static Connection getConnection() 
    {
             try 
            {
                con = DriverManager.getConnection(url, username, password);
               // if(con!=null)
                {
                    System.out.println("successful");
                 return con;
                }
            } 
            catch (SQLException ex) 
            {
                System.out.println("Failed to create the database connection."); 
            }
        return con;
    }
    public static void main(String []args)
    {
    DBConnection.getConnection();
    System.out.println("Hi............");
    }
}