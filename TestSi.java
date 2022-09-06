package com.spring.siobj.list;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//import com.spring.siobj.list.Orderr;
public class TestSi {

	public static void main(String[] args) {
		
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Orderr ord=(Orderr)factory.getBean("O2");
		System.out.println(ord);
		ord.displayItem();
		

	}

}
