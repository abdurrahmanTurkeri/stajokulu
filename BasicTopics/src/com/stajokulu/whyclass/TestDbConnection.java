package com.stajokulu.whyclass;

public class TestDbConnection {
	public static void main(String[] args) {
		try {
		String firstName=DatabaseDataCollector.getUserName(1);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
