/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author SHOAIB SHAIKH
 */
public class DatabaseSearch {
       
        private Connection con = null;
        private Statement ps = null;
        private ResultSet rr= null;
        
        //for finding shirt
        public ResultSet findShirt(String s)
        {
           try{
           con=DBConnection.getConnection();
           ps = con.createStatement();
         
           
           rr = ps.executeQuery("select * from shirt where mobile ='"+s+"'");
          
           }
           catch(SQLException ex)
           {
              JOptionPane.showMessageDialog(null, ex.toString());
           }
           return rr;
       }
        
        //for finding old customer
          public ResultSet findOldCustomer(String s)
        {
           try{
           con=DBConnection.getConnection();
           ps = con.createStatement();
         
           
           rr = ps.executeQuery("select * from customer where mobile ='"+s+"'");
          
           }
           catch(SQLException ex)
           {
              JOptionPane.showMessageDialog(null, ex.toString());
           }
           return rr;
       }
      //for finding pant
               public ResultSet findPant(String s)
        {
           try{
           con=DBConnection.getConnection();
           ps = con.createStatement();
         
           
           rr = ps.executeQuery("select * from pant where mobile ='"+s+"'");
          
           }
           catch(SQLException ex)
           {
              JOptionPane.showMessageDialog(null, ex.toString());
           }
           return rr;
       }
               //for finding shirt
                    public ResultSet findSuit(String s)
        {
           try{
           con=DBConnection.getConnection();
           ps = con.createStatement();
         
           
           rr = ps.executeQuery("select * from suit where mobile ='"+s+"'");
          
           }
           catch(SQLException ex)
           {
              JOptionPane.showMessageDialog(null, ex.toString());
           }
           return rr;
       }
                    
                  //for finding kurta  
                   public ResultSet findKurta(String s)
        {
           try{
           con=DBConnection.getConnection();
           ps = con.createStatement();
         
           
           rr = ps.executeQuery("select * from SHOAIB.kurta where mobile ='"+s+"'");
          
           }
           catch(SQLException ex)
           {
              JOptionPane.showMessageDialog(null, ex.toString());
           }
           return rr;
       }
                    
}
