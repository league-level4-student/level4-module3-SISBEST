package _02_gotta_catchem_all;

public class ExceptionMethods {
	static double divide(double a, double b) {
		if(b == 0) {
			throw new java.lang.IllegalArgumentException("Ya can't divide by 0!");
		}
		double ab = a/b;
		System.out.println(ab);
		return ab;
		}
	String reverse(String rev) {
		if(rev == "") {
			throw new java.lang.IllegalStateException("wtf you can't reverse nothing");
		}
		else {
			return new StringBuilder(rev).reverse().toString();
		}
	}
}
