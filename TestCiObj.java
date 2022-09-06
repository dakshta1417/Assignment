package com.spring.ciobj.list;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestCiObj {

	public static void main(String[] args) {
		
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory factory= new XmlBeanFactory(resource);
		
		Library l=(Library)factory.getBean("l2");
		System.out.println(l);
		l.displayBook();
		
	

	}

}
