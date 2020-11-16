package animals;

public class Calculator {

	public static void main(String[] args) {

		System.out.println(add(2, 3));
		System.out.println(subtract(3, 2));
		System.out.println(multiply(3, 2));
		System.out.println(division(3, 2));
		System.out.println(square(3));

	}

	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	public static int subtract(int num1, int num2) {
		int minus = num1 - num2;
		return minus;
	}

	public static int multiply(int num1, int num2) {
		int multiply = num1 * num2;
		return multiply;
	}

	public static int division(int num1, int num2) {
		int divide = num1 / num2;
		return divide;
	}

	public static int square(int num1) {
		int squared = num1 * num1;
		return squared;
	}

}
