package com.vetias.java.workshop.TempData.dao;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.vetias.java.workshop.TempData.dao.OrganizationDAO;
public class JDBCExample {
    public static void main(String[] args) {
        Connection dbConnection = null;
        try
        {
            Class.forName("org.h2.Driver");
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }    
        try 
        {
            dbConnection = 
            DriverManager.getConnection(
                "jdbc:h2:mem:tempdataDB", "sa", null);
        } 
        catch(SQLException sqlException)
        {
            System.out.println("Error Creating table: " + sqlException);
        }                                        
    
}
}

    