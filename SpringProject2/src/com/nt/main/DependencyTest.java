package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.CurrentSeason;

//ClientApplication
public class DependencyTest {
public static void main(String[] args) {
	
	//IOC Container
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	//Type-Safe Conversion
	CurrentSeason cs = ctx.getBean("cs",CurrentSeason.class);
	String season = cs.currentSeason();
	
	System.out.println(season);
}
}
