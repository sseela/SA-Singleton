
public class mainClass {

	public static void main(String[] args) {
		Example e1 = Example.getInstance();
		Example e2 = Example.getInstance();
		Example e3 = Example.getInstance();
		
		e1.setStr("Sandeep S");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

	}

}
