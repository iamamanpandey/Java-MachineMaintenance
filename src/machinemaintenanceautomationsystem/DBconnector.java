/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinemaintenanceautomationsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author LEGION
 */
class DBconnector {
     public static Connection getConnection() throws Exception
         
    {
          Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection cn=(Connection)
             DriverManager.getConnection( "jdbc:mysql://localhost/inventory","root","");

     
       return cn;
    }
}