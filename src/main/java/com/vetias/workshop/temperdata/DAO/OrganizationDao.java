package com.vetias.workshop.temperdata.DAO;

import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrganizationDao {
    public void createTable (Connection dbConnection) {
        try(Statement statement = dbConnection.createStatement()) {
                statement.execute("""
                        CREATE TABLE Organization (
                        id int AUTO_INCREMENT PRIMARY KEY,
                        NAME VARCHAR(100),
                        WEBSITE VARCHAR(100),
                        EMAIL VARCHAR(100),
                    CONTACT_NUMBER VARCHAR(100),
                    REGISTRATION_NO INT,
                    DESCRIPTION VARCHAR(255))
                     """);
        } catch (SQLException sqlException) {
            System.err.println("Error creating Organization table: " + sqlException.getMessage());
        }
            
    
      
    }
    public int save (Connection dbConnection, Organization vet){
        try(PreparedStatement preparedStatement = dbConnection.prepareStatement("""
            INSERT INTO Organization (NAME, WEBSITE, EMAIL, CONTACT_NUMBER, 
            REGISTRATION_NO, DESCRIPTION) VALUES (?, ?, ?, ?, ?, ?)            
                        """;)){
                        preparedStatement.setString(1, vet.getName());
                        preparedStatement.setString(2, vet.getWebsite());
                        preparedStatement.setString(3, vet.getEmail());
                        preparedStatement.setString(4, vet.getContactNumber()); 
                        preparedStatement.setInt(5, vet.getRegistrationNo());
                        preparedStatement.setString(6, vet.getDescription());
                        PreparedStatement.executeUpdate();
    
        
    } catch (SQLException sqlExceptionException) {
        System.out.println("Error inserting into table: " + sqlExceptionException.getMessage());
      
    }
    return 0; 
    
    }

}
