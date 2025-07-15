package com.vetias.java.workshop.TempData.dao;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import org.h2.jdbcx.JdbcDataSource;

import com.vetias.java.workshop.TempData.Beans.Organization;

public class OrganizationDAO {
    public void createTable(Connection dbConnection) {
       
        try ( Statement statement = dbConnection.createStatement()) {
           
            statement.execute(
                """
                CREATE TABLE organization (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    NAME VARCHAR(100),
                    WEBSITE VARCHAR(100),
                    EMAIL VARCHAR(100),
                    CONTACT_NUMBER VARCHAR(100),
                    REGISTRATION_NO INT
                )
                """
            );
        } catch (SQLException sqlException) {
            System.out.println("Error Creating Table:" + sqlException);
        }
    }
    public int save(Connection dbConnection,Organization vet){
        try(PreparedStatement preparedStatement = dbConnection.prepareStatement(
                "INSERT INTO organization (NAME, WEBSITE, EMAIL, CONTACT_NUMBER, REGISTRATION_NO) VALUES (?, ?, ?, ?, ?)"
        )) {
            preparedStatement.setString(1, vet.name());
            preparedStatement.setString(2, vet.website());
            preparedStatement.setString(3, vet.email());
            preparedStatement.setString(4, vet.contactNumber());
            preparedStatement.setLong(5, vet.registrationNumber());
            preparedStatement.setString(6, vet.description());
            return preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            System.out.println("Error Saving Organization: " + sqlException);
            return 0;
        }
                                                     
}
}