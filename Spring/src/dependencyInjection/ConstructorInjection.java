package dependencyInjection;

public class ConstructorInjection {
	
	private String name,email;
	private int age;
	
	private ConstructorInjection(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	public void printData() {
		System.out.println("name.."+name+"\nage.."+age+"\nemail.."+email);
	}

}
