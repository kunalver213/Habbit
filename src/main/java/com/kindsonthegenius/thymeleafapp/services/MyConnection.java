package com.kindsonthegenius.thymeleafapp.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	
	private static Connection con;
    
    public static Connection Connect() throws ClassNotFoundException, SQLException{
    	
    	if(con!=null && !con.isClosed())
    		return con;
    				
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://bkb4oho1eggc3yghri9k-mysql.services.clever-cloud.com:3306/bkb4oho1eggc3yghri9k"
        		,"unqvxqefocyrf9d8"
        		,"U4sRAxrOcwUfVkAyA1cY");        
        return con;
    }
    
    public static void Close() throws SQLException{
        con.close(); 
    }
}