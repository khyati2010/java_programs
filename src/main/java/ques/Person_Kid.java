package ques;
public class Person_Kid
{
    public static void main(String args[]) 
    {
        Person p = new Kid();  
        p.whoAmI(); 
        p.whoAreYou(); 
    }
	/*
	 * Explanation: Static binding (or compile time) happens for static methods.
	 * Here p.whoAmI() calls the static method so it is called during compile
	 * time hence results in static binding and prints the method in People
	 * class. Whereas p.whoAreYou() calls the method in Kid class since by
	 * default Java takes it as a virual method i.e, dynamic binding.
	 */

}