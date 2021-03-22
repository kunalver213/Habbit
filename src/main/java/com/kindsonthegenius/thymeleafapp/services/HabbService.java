package com.kindsonthegenius.thymeleafapp.services;

import java.sql.ResultSet;
import java.sql.Statement;

public class HabbService {
	
	public static String dashdata() {
		String morning = "";
		String afternoon = "";
		String evening = "";
		
		try {
			ResultSet rs = MyConnection.Connect().createStatement()
					.executeQuery("select * from d_schedule order by time;"); 
			while(rs.next()){	
				int time = Integer.parseInt((rs.getString("time").replace(":", "")));
				if(time < 130000) {
					morning += ",\"shd"+rs.getString("id")+"\":{"
							+ "\"title\":\""+rs.getString("title")+"\""
							+ ",\"time\":\""+rs.getString("time")+"\""
							+ "}";
				}else 
				if(time < 170000) {
					afternoon += ",\"shd"+rs.getString("id")+"\":{"
							+ "\"title\":\""+rs.getString("title")+"\""
							+ ",\"time\":\""+rs.getString("time")+"\""
							+ "}";
				}else{
					evening += ",\"shd"+rs.getString("id")+"\":{"
							+ "\"title\":\""+rs.getString("title")+"\""
							+ ",\"time\":\""+rs.getString("time")+"\""
							+ "}";
				}
				
			}
		} catch (Exception e) { }		

		morning = morning.substring(1);
		afternoon = afternoon.substring(1);
		evening = evening.substring(1);


		return "{ \"Morning\" : { "+morning+" }, \"Afternoon\" : { "+afternoon+" }, \"Evening\" : { "+evening+" } }";

	}
	


}
