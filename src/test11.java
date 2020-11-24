//singleton - one object should be returned on each request
// private constructor, private static variable, public static method 
// Singleton classes are mostly used for DB connection pools
class Practice {
	private static Practice prac = null;
	private Practice() {}
	public static Practice getObject() {
		if(prac == null) {
			prac = new Practice();
		} 
		return prac;
	}
}

public class test11 {
	public static void main(String[] args) {
		Practice p1 = Practice.getObject();
		Practice p2 = Practice.getObject();
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode() == p2.hashCode());
	}
}


class test2 {
	public static void main(String[] args) {
		String s1 = new String("sandeep");
		String s4 = new String("sandeep");
		System.out.println(s1.substring(1,3));
		System.out.println(s1 == s4);
		
		String s5 = "kar";
		String s6 = "kar";
		System.out.println(s5 == s6);
		
		// StringBuffer and StringBuilder are mutable.
		StringBuffer s2 = new StringBuffer("karan");
		s2.append('j');
		System.out.println(s2);
		
		StringBuilder s3 = new StringBuilder("rohith");
		
	}
}