package com.hl.test;

import com.hl.app.AppConfig;
import com.hl.fb.MyBean;
import com.hl.fb.MyFactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		MyFactoryBean myFactoryBean = (MyFactoryBean) applicationContext.getBean("&myFactoryBean");
		myFactoryBean.test();
		System.out.println("MyTest.main");
	}
}
