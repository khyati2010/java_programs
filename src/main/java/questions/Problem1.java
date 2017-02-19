package questions;

// filename: Test.java
class Problem1 {
	int y = 2;
	int x = y + 2;

	public static void main(String[] args) {
		Problem1 m = new Problem1();
		System.out.println("x = " + m.x + ", y = " + m.y);
	}
	
	/*
	 * Output of the above program is “x = 4, y = 2”. y is initialized first,
	 * then x is initialized as y + 2. So the value of x becomes 4.
	 */
}