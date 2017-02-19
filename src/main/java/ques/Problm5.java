package ques;

class Problm5 {
	public static void main(String args[]) {
		String s1 = new String("geeksforgeeks");
		String s2 = new String("geeksforgeeks");
		if (s1 == s2)
			System.out.println("Equal");
		else
			System.out.println("Not equal");
	}
	/*
	 * Output:
	 * 
	 * Not equal Explanation: Since, s1 and s2 are two different objects the
	 * references are not the same, and the == operator compares object
	 * reference. So it prints “Not equal”, to compare the actual characters in
	 * the string .equals() method must be used.
	 */
}