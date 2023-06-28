package com.example;

import java.sql.*;

public class dataBaseCreate {
    public static void main(String[] args){
        Connection connect = null;
        Statement stm = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connect = DriverManager.getConnection("jdbc:sqlite:test.db");
            System.out.println("Opened Database Successfully");

            stm=connect.createStatement();
            String sql = "CREATE TABLE EMPLOYEES"+
                            "(ID INT PRIMARY KEY     NOT NULL,"+
                            "NAME           TEXT    NOT NULL,"+
                            "AGE            INT     NOT NULL,"+
                            "JOB DESCRIPTION TEXT   NOT NULL,"+
                            "SALARY         REAL)";
            stm.executeUpdate(sql);
            stm.close();
            connect.close();

        } catch (Exception e) {
            
            e.printStackTrace();
        } 
        System.out.println("Table created Successfully");
        
    }
}
