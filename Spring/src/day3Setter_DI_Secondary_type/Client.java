package day3Setter_DI_Secondary_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String file[]= new String[]{"resources/car.xml","resources/engine.xml"};
		ApplicationContext ap = new ClassPathXmlApplicationContext(file);
		
		Carbean car = (Carbean) ap.getBean("c");
		car.printData();
	}

}
