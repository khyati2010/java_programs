package ques;

// filename Main.java
class OuputProb {
	protected int x, y;
}

class Main {
	public static void main(String args[]) {
		OuputProb t = new OuputProb();
		System.out.println(t.x + " " + t.y);
	}
	/*
	 * Output 0 0 In Java, a protected member is accessible in all classes of
	 * same package and in inherited classes of other packages. Since Test and
	 * Main are in same package, no access related problem in the above program.
	 * Also, the default constructors initialize integral variables as 0 in Java
	 * (See this GFact for more details). That is why we get output as 0 0.
	 */
}
