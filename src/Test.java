
public class Test {

	public static void main(String[] args) {
		Greeter g = new Greeter();

		System.out.println(g.toString());

		Greeter[] gs = new Greeter[5];

		for (int x = 0; x < 5; x++)
			gs[x] = new Greeter();

		for (int y = 0; y < 5; y++)
			System.out.println(gs[y].toString());
	}

}
