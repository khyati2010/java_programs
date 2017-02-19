package ques;
class Test3 {
    public static void main(String[] args) {
        for(int i = 0; 1; i++) {
            System.out.println("Hello");
            break;
        }
    }
	/*
	 * Output: Compiler Error There is an error in condition check expression of
	 * for loop. Java differs from C++(or C) here. C++ considers all non-zero
	 * values as true and 0 as false. Unlike C++, an integer value expression
	 * cannot be placed where a boolean is expected in Java. Following is the
	 * corrected program.
	 */
}