package com.DataBase;

import java.sql.*;

public class LoginPinCheck 
{
 public static int loginPinCheck(String p)
 {
     int i=0;
     try 
     {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ShivShaktiKirana","root","root1234");
      PreparedStatement ps = con.prepareStatement("select * from Registration where pin=?;");
      ps.setString(1, p);
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