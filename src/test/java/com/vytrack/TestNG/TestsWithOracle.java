package com.vytrack.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public void tearDown() throws SQLException {
        resultSet.close();
        statement.close();
        connection.close();
}
    @Test
    public void connectionTest() throws SQLException {

        while(resultSet.next()){
            System.out.println(resultSet.getObject(1)+"|"+resultSet.getObject(2)+"|"+resultSet.getObject(3));
        }
    }

    @Test
    public void mapTest(){
        List<Map<String,String>> salaryList = new ArrayList<>();
        Map<String,String> map1 = new HashMap<>();

    }



}
