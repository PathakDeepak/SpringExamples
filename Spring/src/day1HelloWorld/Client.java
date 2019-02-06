package day1HelloWorld;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource r = new ClassPathResource("resources/spring.xml");
		
		@SuppressWarnings("deprecation")
		
		//*****************************************************************************
		// with BeanFactory class the object is created only when first time the getBean() method is called
		BeanFactory factory = new XmlBeanFactory(r);
		
		//create object for the POJO class
				Object o1 = factory.getBean("t");
				Object o2 = factory.getBean("t");
				
				//To check whether object instance created are multiple or single
				System.out.println(o1 == o2); 
				
				Test t1 = (Test) o1;
				t1.hello();
	    //******************************************************************************
				
		//******************************************************************************		
		// with ApplicationContext class the object is created when the XML file is loaded
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		Object o = ap.getBean("t");
		Test t =(Test) o;
			t.hello();
			
		//*****************************************************************************	
		
	}

}
