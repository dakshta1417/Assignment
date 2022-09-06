package com.springwithdependencies.si;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//import com.springwithdependencies.si.Orderr;

public class SiTest {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Orderr or=(Orderr)factory.getBean("o1");
		System.out.println(or);
		

	}

}
