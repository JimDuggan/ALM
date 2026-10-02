public class Recursion_02
{
	public static void main (String args[]) 
	{
		System.out.println("Before count.");
		count(0);
		System.out.println("After count.");
	}

	public static void count (int index) 
	{
		System.out.println(index);
		if (index < 2) {
			count(index+1);
		}
	}
}
