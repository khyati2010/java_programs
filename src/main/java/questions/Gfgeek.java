package questions;

class Gfgeek {
	// constructor
	Gfgeek() {
		System.out.println("Geeksforgeeks");
	}

	static Gfgeek a = new Gfgeek(); // line 8

	public static void main(String args[]) {
		Gfgeek b; // line 12
		b = new Gfgeek();
	}

	/*
	 * Output:
	 * 
	 * Geeksforgeeks Geeksforgeeks Explanation: We know that static variables
	 * are called when a class loads and static variables are called only once.
	 * Now line 13 results to creation of object which inturn calls the
	 * constructor and “Geeksforgeeks” is printed second time. If in line 8
	 * static variable would not have been used the object would have been
	 * called recursively infinitively leading to StackOverFlow error. See this
	 * for a sample run.
	 */
}