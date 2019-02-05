package setter_DI_Secondary_type;

public class CarBean {

	private String carName;
	private EngineBean engine;
	
	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void setEngine(EngineBean engine) {
		this.engine = engine;
	}

	public void printData() {
		System.out.println("car name.."+carName);
		System.out.println("Engine name..."+engine.getModelYear());
	}
	
	
}
