package com.hl.test;

import com.hl.app.AppConfig;
import com.hl.fb.MyBean;
import com.hl.fb.MyFactoryBean;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyTest {

	public static void main(String[] args) {
		Log log = LogFactory.getLog(MyTest.class);

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		MyBean myBean = (MyBean) applicationContext.getBean("myFactoryBean");
		myBean.test();
		System.out.println("MyTest.main");
		log.info("222222");


	}
}
