package java16;

public class Human {
	String name;
	
	public Human(String name) {
		this.name = name;
	}
	
	public void intro() {
		System.out.println("私は" + this.name + "です");
	}
}
