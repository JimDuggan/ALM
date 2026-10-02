public class Recursion_03
{
	public static void main (String args[]) 
	{
		System.out.println("Before count.");
		count(0);
		System.out.println("After count.");
	}

	public static void count (int index) 
	{
		if (index < 2) {
			count(index+1);
		}
		System.out.println(index);
	}
}
