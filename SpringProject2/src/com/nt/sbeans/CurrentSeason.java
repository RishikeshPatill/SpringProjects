package com.nt.sbeans;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cs")
public class CurrentSeason {

	@Autowired
	private LocalDate localDate;

	public String currentSeason() {

		int  month=(int)localDate.getMonthValue();
	    
		if(month<3) {
			return "WinterSeason";
		}
		else if(month<5) {
			return "SpringSeason";		
		}
		else if(month<7) {
			return "SummerSeason";		
		}
		else if(month<10) {
			return "MonsoonSeason :)";		
		}
		else 
			return "AutumnSeason";
		
	}

}
