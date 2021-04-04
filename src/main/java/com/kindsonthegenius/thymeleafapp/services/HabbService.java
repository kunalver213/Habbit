package com.kindsonthegenius.thymeleafapp.services;

import java.sql.ResultSet;


public class HabbService {
	
	// option: 1=default, 2=allDashdata
	public static String dashdata(int option) {
		String morning = "";
		String afternoon = "";
		String evening = "";
		
		String log = getlogDasdata();
		String weekDayNo = "("+getWeekDayNo()+")";
		String monthNo = "("+getMonthNo()+")";
		
		try {
			ResultSet rs = MyConnection.Connect().createStatement()
					.executeQuery("select * from d_schedule order by time;"); 
			while(rs.next()){
				
				if(option == 0) {
					if(!rs.getString("week").trim().equals("")) { 
						if(!rs.getString("week").contains(weekDayNo)) {
							continue; 
						}
					}
					if(!rs.getString("month").trim().equals("")) { 
						if(!rs.getString("month").contains(monthNo)) {
							continue; 
						}
					}
				}
				
				int time = Integer.parseInt((rs.getString("time").replace(":", "")));
				if(time < 130000) {
					morning += ",{"
							+ "\"id\":\""+rs.getString("id")+"\""
							+ ",\"title\":\""+rs.getString("title")+"\""
							+ ",\"time\":\""+rs.getString("time")+"\""
							+ ",\"week\":\""+rs.getString("week")+"\""
							+ ",\"month\":\""+rs.getString("month")+"\""
							+ ",\"status\":\""+((log.contains("["+rs.getString("id")+"]"))?"1":"0")+"\""
							+ "}";
				}else 
				if(time < 170000) {
					afternoon += ",{"
							+ "\"id\":\""+rs.getString("id")+"\""
							+ ",\"title\":\""+rs.getString("title")+"\""
							+ ",\"time\":\""+rs.getString("time")+"\""
							+ ",\"week\":\""+rs.getString("week")+"\""
							+ ",\"month\":\""+rs.getString("month")+"\""
							+ ",\"status\":\""+((log.contains("["+rs.getString("id")+"]"))?"1":"0")+"\""
							+ "}";
				}else{
					evening += ",{"
							+ "\"id\":\""+rs.getString("id")+"\""
							+ ",\"title\":\""+rs.getString("title")+"\""
							+ ",\"time\":\""+rs.getString("time")+"\""
							+ ",\"week\":\""+rs.getString("week")+"\""
							+ ",\"month\":\""+rs.getString("month")+"\""
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
	
	public static String getMonthNo() {
		String weekDayNo = "";
		
		try {
			ResultSet rs = MyConnection.Connect().createStatement()
					.executeQuery("SELECT MONTH(CURRENT_DATE());"); 
			while(rs.next()){
				weekDayNo = rs.getString(1);
			}
	
		} catch (Exception e) { }		

		return weekDayNo;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(dashdata(1));
	}

}
