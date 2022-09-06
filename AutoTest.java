package com.spring.autowiring.setter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AutoTest {

	public static void main(String[] args) {
		
		Resource resource= new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Student s1=(Student)factory.getBean("s3");
System.out.println(s1);

		
	}

}
