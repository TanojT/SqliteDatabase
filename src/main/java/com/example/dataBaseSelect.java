package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dataBaseSelect {
public static void main(String[] args) {
    Connection connect=null;
    Statement stm=null;
    try {
        Class.forName("org.sqlite.JDBC");
        connect =DriverManager.getConnection("jdbc:sqlite:test.db");
        connect.setAutoCommit(false);
        stm=connect.createStatement();
        ResultSet result = stm.executeQuery("SELECT * FROM EMPLOYEES;");
        if(!result.isBeforeFirst()){
            System.out.println("Nothing");
        }
        System.out.println(result.next());
        while(result.next()){
            System.out.println("ID:"+result.getInt("id"));
            System.out.println("Name:"+result.getInt("NAME"));
            System.out.println("Age:"+result.getInt("AGE"));
            System.out.println("Job Description:"+result.getInt("Job"));
            System.out.println("Salary:"+result.getInt("SALARY"));
            
        }
        result.close();
        stm.close();
        connect.close();
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
}
