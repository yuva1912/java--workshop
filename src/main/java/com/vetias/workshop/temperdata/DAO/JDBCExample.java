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
        OrganizationDAO organizationDAO = new OrganizationDAO();
        organizationDAO.createTable(dbConnection);
        Organization organization = new Organization( name:"VET",   
        Description: "Vellarlar Education Trust";                                    
        Website: "www.vellarlar.com";
        Email: "contact@vet.com";
        ContactNumber: "1234567890";
        RegistrationNo: 123456, registration:null);
        organizationDAO.save(dbConnection, vet);
        System.out.println("Organization saved successfully.");
}
}

    