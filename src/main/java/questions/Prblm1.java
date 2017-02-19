package questions;
class Prblm1
{
    public static void main(String args[])
    {
        try
        {
            System.out.println("First statement of try block");
            int num=45/3;
            System.out.println(num);
        }
        catch(Exception e)
        {
            System.out.println("Gfg caught Exception");
        }
        finally
        {
            System.out.println("finally block");
        }
        System.out.println("Main method");
    }
	/*
	 * Output:
	 * 
	 * First statement of try block 15 finally block Main method Explanation:
	 * Since there is no exception, the catch block is not called, but the
	 * finally block is always executed after a try block whether the exception
	 * is handled or not.
	 */
}