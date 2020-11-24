
public class Example {

	private static Example exam = null;
	private String str;
	
	private Example() {
		str = "sandeep";
	}
	
	public static Example getInstance() {
		if(exam == null) {
			exam = new Example();
		}
		return exam;
	}
	
	public String getStr() {
		return this.str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public String toString() {
		return this.str;
	}
}

