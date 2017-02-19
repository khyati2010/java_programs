package questions;
public class Problm2
{
    public static void main(String[] args)
    {
        Integer a = 128, b = 128;
        System.out.println(a == b);
 
        Integer c = 100, d = 100;
        System.out.println(c == d);
    }
	/*
	 * Output:
	 * 
	 * false true Explanation: In the source code of Integer object we will find
	 * a method ‘valueOf’ in which we can see that the range of the Integer
	 * object lies from IntegerCache.low(-128) to IntegerCache.high(127).
	 * Therefore the numbers above 127 will not give the expected output. The
	 * range of IntegerCache can be observed from the source code of the
	 * IntegerCache class. Please refer this for details.
	 * 
	 */
}