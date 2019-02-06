package day4Autowire;

public class Car {
	
	private String carName;
	private Engine engine;
	
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void printData() {
		System.out.println("car name..."+carName);
		System.out.println("Engine model year..."+engine.getModelYear());
	}

}
