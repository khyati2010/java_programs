package ques;

class OuputPro5 {
	public static void main(String args[]) {
		System.out.println(fun());
	}

	int fun() {
		return 20;
	}
	/*
	 * Output: Compiler Error Like C++, in Java, non-static methods cannot be
	 * called in a static method. If we make fun() static, then the program
	 * compiles fine without any compiler error. Following is the corrected
	 * program.
	 */
}