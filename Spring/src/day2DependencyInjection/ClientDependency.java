package day2DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientDependency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext cp = new ClassPathXmlApplicationContext("resources/spring.xml");
		TestDependencyInjection td = (TestDependencyInjection) cp.getBean("t_dependency");
		
		td.hello("Desert_Hawk");
		
		ConstructorInjection ci = (ConstructorInjection) cp.getBean("ci");
		ci.printData();
	}

}
