package com.vetias.workshop.temperdata.DAO;

import java.sql.SQLException;

public class OrganizationDao {
    public void createTable() {
        JdbcDataSource h2DataSource = new JdbcDataSource();
        h2DataSource.setURL("jdbc:h2:mem:tempdataDB");
        h2DataSource.setUser("sa");
        try (Connection dbconnection = h2DataSource.getConnection()) {
            Statement statement = dbconnection.createStatement();
               Statement.execute("""
                CREATE TABLE IF NOT EXISTS organization (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    NAME VARCHAR(100),
                    WEBSITE VARCHAR(100),
                    EMAIL VARCHAR(100),
                    PHONE VARCHAR(100),
                    REGISTRATION_NO INT,   

                       """);
            
        } catch (SQLException e) {
           System.out.println("Error creating table"+SQLException);

        }
    }

}
