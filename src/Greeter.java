
public class Greeter {

	private int age;
	private String name;

	public Greeter() {
		age = 35;
		name = "Christopher";
	}

	public Greeter(int a, String n) {
		age = a;
		name = n;
	}

	public String toString() {
		return "Age: " + age + " Name: " + name;
	}

}
