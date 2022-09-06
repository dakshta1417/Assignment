package com.springwithdependencies.ci;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CiTest {

	public static void main(String[] args) {
	
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Library lib=(Library)factory.getBean("l1");
		System.out.println(lib);
		

	}

}
