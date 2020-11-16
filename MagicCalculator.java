package animals;

public class MagicCalculator extends Calculator {

	double num1 = 3;

	public static void main(String[] args) {

	}

	public static double sqroot(int num1) {
		return Math.sqrt(num1);
	}

	public static double sine(double num1) {
		double rads = Math.toRadians(num1);
		return Math.sin(rads);
	}

	public static double cosine(double num1) {
		double rads = Math.toRadians(num1);
		return Math.cos(rads);
	}

	public static double tangent(double num1) {
		double rads = Math.toRadians(num1);
		return Math.tan(rads);
	}

	public long factorial(long n) {
		long fact = 1;
		for (int i = 2; i <= n; i++) {
			fact = fact * i;
		}
		return fact;

	}

}
