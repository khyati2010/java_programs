package ouput;
// file name: Main.java
 
class Base {
    protected void foo() {}
} 
class Derived extends Base {
    void foo() {}
} 
public class Main {
    public static void main(String args[]) {
        Derived d = new Derived();
        d.foo();
    }
	/*
	 * Output: Compiler Error foo() is protected in Base and default in Derived.
	 * Default access is more restrictive. When a derived class overrides a base
	 * class function, more restrictive access can’t be given to the overridden
	 * function. If we make foo() public, then the program works fine without
	 * any error. The behavior in C++ is different. C++ allows to give more
	 * restrictive access to derived class methods
	 */
}