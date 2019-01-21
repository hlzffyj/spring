package com.hl.fb;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class MyFactoryBean implements FactoryBean {

	public void test(){
		System.out.println("myFactoryBean");
	}
	@Override
	public Object getObject() throws Exception {
		return new MyBean();
	}

	@Override
	public Class<?> getObjectType() {
		return MyBean.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
