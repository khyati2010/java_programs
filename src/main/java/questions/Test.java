package questions;
public class Test 
{    
    int x = 2;
    Test(int i) { x = i; } 
    public static void main(String[] args) {    
         Test t = new Test(5);
     
         System.out.println("x = " + t.x);
    }
    
	/*
	 * Output of the above program is “x = 5”. The initialization with class
	 * declaration in Java is like initialization using Initializer List in C++.
	 * So, in the above program, the value assigned inside the constructor
	 * overwrites the previous value of x which is 2, and x becomes 5.
	 */
}