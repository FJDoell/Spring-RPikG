package com.day;

import org.springframework.stereotype.Service;

import com.global.GlobalData;

@Service
public class DayService {
	int timePerDay = 120;
	int time = 0;
	
	public GlobalData nextDay(GlobalData data) {
		this.time = 0;
		data.setDayCount(data.getDayCount()+1);
		return data;
	}
	
	public int tickTime() {
		this.time++;
		return time;
	}
}
