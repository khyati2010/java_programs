package ques;

// filename Test.java
class Ouput1 {
	public static void main(String args[]) {
		System.out.println(fun());
	}

	static int fun() {
		static int x = 0;
		return ++x;
	}

	/*
	 * Output: Compiler Error Unlike C++, static local variables are not allowed
	 * in Java. See this GFact for details. We can have class static members to
	 * count number of function calls and other purposes that C++ local static
	 * variables serve. Following is the corrected program.
	 */
}