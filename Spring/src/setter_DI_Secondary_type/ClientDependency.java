package setter_DI_Secondary_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientDependency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String file[]= new String[] {"resources/car.xml", "resources/engine.xml"};
		ApplicationContext cp = new ClassPathXmlApplicationContext(file);
		CarBean cb = (CarBean) cp.getBean("c");
		
		cb.printData();
		
	}

}
