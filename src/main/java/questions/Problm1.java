package questions;

class superClass {
	final public int calc(int a, int b) {
		return 0;
	}
}

class subClass extends superClass {
	public int calc(int a, int b) {
		return 1;
	}
}

public class Problm1 {
	public static void main(String args[]) {
		subClass get = new subClass();
		System.out.println("x = " + get.calc(0, 1));
	}
	/*
	 * Output:
	 * 
	 * Compilation fails. Explanation: The method GetResult() in class A is
	 * final and so cannot be overridden
	 */
}