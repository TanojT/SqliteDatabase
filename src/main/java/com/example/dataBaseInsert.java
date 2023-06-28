package com.example;

import java.sql.*;

public class dataBaseInsert {
    
    public static void main(String[] args){
        Connection connect = null;
        Statement stm = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connect =DriverManager.getConnection("jdbc:sqlite:test.db");
            connect.setAutoCommit(false);
            System.out.println("Opened Database !");
            stm= connect.createStatement();
            String sql ="INSERT INTO EMPLOYEES(ID,NAME,AGE,[JOB],SALARY)"+
                        "vALUES(1002,'Pandu',25,'DALLAS',40000.00)";
            stm.executeUpdate(sql);
            sql ="INSERT INTO EMPLOYEES(ID,NAME,AGE,[JOB],SALARY)"+
                        "vALUES(1003,'Subbu',20,'Kansas',45000.00)";
            stm.executeUpdate(sql);
            sql ="INSERT INTO EMPLOYEES(ID,NAME,AGE,[JOB],SALARY)"+
                        "vALUES(1004,'pranathi',28,'DALLAS',20000.00)";
            stm.executeUpdate(sql);
            sql ="INSERT INTO EMPLOYEES(ID,NAME,AGE,[JOB],SALARY)"+
                        "vALUES(1005,'priyanka',27,'Austin',35000.00)";
            stm.executeUpdate(sql);
            stm.close();
            connect.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
