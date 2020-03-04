package com.DataBase;

import java.sql.*;

public class RegistrationCheck 
{
 public static int registationCheck()
 {
     int i=0;
     try 
     {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ShivShaktiKirana","root","root1234");
      PreparedStatement ps = con.prepareStatement("select * from Registration;");
      ResultSet rs = ps.executeQuery();
      while(rs.next())
      {
       i++;
      }
      
     } 
     catch (Exception e) 
     {
       e.printStackTrace();
     }
     return i;
 }
}
