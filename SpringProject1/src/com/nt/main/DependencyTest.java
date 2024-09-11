package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessage;

//clientApplication
public class DependencyTest {

	public static void main(String[] args) {
		//IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	
		//Not Type-Safe Casting
//		Object bean = ctx.getBean("wm");
//		WishMessage wm=(WishMessage)bean;
		
		//Type-Safe Casting
		WishMessage wm=ctx.getBean("wm",WishMessage.class);
		
		String message = wm.generateWishMessage("Saloni");
		System.out.println(message);;
		
		ctx.close();

	}
}
