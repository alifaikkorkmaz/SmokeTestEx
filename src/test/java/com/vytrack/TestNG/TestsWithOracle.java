package com.vytrack.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.*;

public class TestsWithOracle {

    Connection connection;
    Statement statement;
    ResultSet resultSet;
    @BeforeMethod
    public void setUp() throws SQLException {
        String dbUrl = "jdbc:oracle:thin:@54.92.248.102:1521:xe";
        String dbUsername = "hr";
        String dbPassword = "hr";
        String query = "select first_name,last_name, salary from employees";
        connection = DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
        statement = connection.createStatement();
        resultSet = statement.executeQuery(query);
}
    @AfterMethod
    public void tearDown(){

}
    @Test
    public void connectionTest(){

    }



}
