package ouput;
public class Test
{
    public static void main(String[] args)
    {
        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Love";
        s1.append(s2);
        s1.substring(4);
        int foundAt = s1.indexOf(s2);
        System.out.println(foundAt);
    }
    
	/*
	 * Options : A) -1 B) 3 C) 4 D) A StringIndexOutOfBoundsException is thrown
	 * at runtime. Answer : C) 4 Explanation : append(String str)
	 * method,concatenate the str to s1. The substring(int index) method return
	 * the String from the given index to the end. But as there is no any String
	 * variable to store the returned string,so it will be destroyed.Now
	 * indexOf(String s2) method return the index of first occurrence of s2. So
	 * 4 is printed as s1=”JavaLove”.
	 */
}