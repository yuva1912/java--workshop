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
                        preparedStatement.setString(parameterIndex:1, vet.Name());
                        preparedStatement.setString(parameterIndex:2, vet.Website());
                        preparedStatement.setString(parameterIndex:3, vet.Email());
                        preparedStatement.setString(parameterIndex:4, vet.ContactNumber()); 
                        preparedStatement.setInt(parameterIndex:5, vet.RegistrationNo());
                        preparedStatement.setString(parameterIndex:6, vet.Description());
                        PreparedStatement.executeUpdate();
    
        
    } catch (SQLException sqlExceptionException) {
        System.out.println("Error inserting into table: " + sqlExceptionException.getMessage());
      
    }
    return 0; 

    }

}
