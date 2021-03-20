package com.kindsonthegenius.thymeleafapp.services;

import java.sql.ResultSet;
import java.sql.Statement;

public class HabbService {
	
	public static String dashdata() {
		String advreasonl= "";
		
		try {
			ResultSet rs = MyConnection.Connect().createStatement()
					.executeQuery("select * from d_schedule order by category;"); 
			while(rs.next()){	
				advreasonl += ",\""+rs.getString(2)+"\"";
			}
		} catch (Exception e) { }
		
		
		return "["+advreasonl.substring(1)+"]";
	}
	


}
