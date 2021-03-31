package com.kindsonthegenius.thymeleafapp.services;

import java.sql.ResultSet;


public class HabbService {
	
	public static String dashdata() {
		String morning = "";
		String afternoon = "";
		String evening = "";
		
		String log = getlogDasdata();
		String weekDayNo = getWeekDayNo();
		
		try {
			ResultSet rs = MyConnection.Connect().createStatement()
					.executeQuery("select * from d_schedule order by time;"); 
			while(rs.next()){
				
				if(!rs.getString("week").trim().equals("")) { 
					if(!rs.getString("week").contains(weekDayNo)) {
						continue; 
					}
				}
				
				int time = Integer.parseInt((rs.getString("time").replace(":", "")));
				if(time < 130000) {
					morning += ",{"
							+ "\"id\":\""+rs.getString("id")+"\""
							+ ",\"title\":\""+rs.getString("title")+"\""
							+ ",\"time\":\""+rs.getString("time")+"\""
							+ ",\"status\":\""+((log.contains("["+rs.getString("id")+"]"))?"1":"0")+"\""
							+ "}";
				}else 
				if(time < 170000) {
					afternoon += ",{"
							+ "\"id\":\""+rs.getString("id")+"\""
							+ ",\"title\":\""+rs.getString("title")+"\""
							+ ",\"time\":\""+rs.getString("time")+"\""
							+ ",\"status\":\""+((log.contains("["+rs.getString("id")+"]"))?"1":"0")+"\""
							+ "}";
				}else{
					evening += ",{"
							+ "\"id\":\""+rs.getString("id")+"\""
							+ ",\"title\":\""+rs.getString("title")+"\""
							+ ",\"time\":\""+rs.getString("time")+"\""
							+ ",\"status\":\""+((log.contains("["+rs.getString("id")+"]"))?"1":"0")+"\""
							+ "}";
				}
				
			}
		} catch (Exception e) { }		

		if(!morning.trim().equals("")) {  
		morning = morning.substring(1); }
		
		if(!afternoon.trim().equals("")) {  
		afternoon = afternoon.substring(1); }
		
		if(!evening.trim().equals("")) {  
		evening = evening.substring(1); }


		return "{ \"Morning\" : [ "+morning+" ], \"Afternoon\" : [ "+afternoon+" ], \"Evening\" : [ "+evening+" ] }";

	}


	public static String getlogDasdata() {	
		String log = "";
		try {
			ResultSet rs = MyConnection.Connect().createStatement()
					.executeQuery("select * from d_logs where Date(ts_complete)=CURRENT_DATE();"); 
			while(rs.next()){	
				log += "["+rs.getString("schedule_id")+"]";
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return log;
	}
		
		
	public static String logDasdata(String shdId, String time) {	

		try {
			
			MyConnection.Connect().createStatement()
					.executeUpdate("insert into d_logs (schedule_id, ts_complete) values ("+shdId+", '"+time+"'); ");

			return  "1";

		} catch (Exception e) {
			return  "0"+e.toString();}	
	}
	
	
	public static String getWeekDayNo() {
		String weekDayNo = "";
		
		try {
			ResultSet rs = MyConnection.Connect().createStatement()
					.executeQuery("SELECT WEEKDAY(CURRENT_DATE());"); 
			while(rs.next()){
				weekDayNo = rs.getString(1);
			}
	
		} catch (Exception e) { }		

		return weekDayNo;
	}
	

}
