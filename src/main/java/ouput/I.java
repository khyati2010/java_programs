package ouput;
import java.util.*; 
class I 
{
    public static void main (String[] args) 
    {
        Object i = new ArrayList().iterator(); 
        System.out.print((i instanceof List) + ", "); 
        System.out.print((i instanceof Iterator) + ", "); 
        System.out.print(i instanceof ListIterator); 
    } 
	/*
	 * Output:
	 * 
	 * false, true, false Explanation: The iterator() method returns an iterator
	 * over the elements in the list in proper sequence, it doesn’t return a
	 * List or a ListIterator object. A ListIterator can be obtained by invoking
	 * the listIterator method.
	 */
}