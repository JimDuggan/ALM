public class Recursion_04
{
	public static void main (String args[]) 
	{
		upAndDown(1);
	}

	public static void upAndDown(int n) 
	{
		System.out.println("Level: " +  n);
		if (n < 4){
			upAndDown(n+1);
		}
		System.out.println("LEVEL: " + n);
	}
}

