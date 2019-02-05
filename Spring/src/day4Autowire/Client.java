package day4Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		ApplicationContext ap= new ClassPathXmlApplicationContext("resources/autowire.xml", "resources/autowireEngine.xml");
		Car car = (Car)ap.getBean("c");
		car.printData();
	}
}
