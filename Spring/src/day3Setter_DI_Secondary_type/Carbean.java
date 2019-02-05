package day3Setter_DI_Secondary_type;

public class Carbean {

	private String carname;
	private Enginebean engine;
	
	public void setCarname(String carname) {
		this.carname = carname;
	}
	
	public void setEngine(Enginebean engine) {
		this.engine = engine;
	}
	
	public void printData() {
		System.out.println("car name "+ carname);
		System.out.println("Model year "+engine.getModelYear());
	}
}
