package day4AutowireAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ap =new ClassPathXmlApplicationContext("resources/annotationAutowire.xml");
		Car car = (Car)ap.getBean("c");
		car.printData();
	}

}
