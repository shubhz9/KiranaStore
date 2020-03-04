
package com.DataBase;

import java.sql.*;
import com.Bean.RegistrationBean;

public class Registration 
{
 public static int checkUser(RegistrationBean rb)
 {
   int i=0; 
     try 
     {
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ShivShaktiKirana","root","root1234");
       PreparedStatement ps = con.prepareStatement("insert into Registration values(?,?,?,?);");
       ps.setString(1, rb.getName());
       ps.setString(2, rb.getEmail());
       ps.setInt(3, rb.getMobno());
       ps.setString(4, rb.getPin());

       i = ps.executeUpdate();
   
     }
     catch (Exception e)
     {
       e.printStackTrace();
     }
   
   return i;
 }
}
