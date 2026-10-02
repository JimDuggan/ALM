public class FibonacciTest 
{
	public static void main (String args[])
	{
		long number, fibonacciValue;
		String input = javax.swing.JOptionPane.showInputDialog("Enter value:");
		number = Long.parseLong(input);

		fibonacciValue = fibonacci(number);             

		System.out.println("Fibonacci of " + number + " is " + fibonacciValue);
		System.exit(0);
	} 

	// recursive declaration of fibonacci         
	public static long fibonacci(long n)                      
	{                                                    
		if (n == 0 || n == 1) // Base cases                       
			return n;
		else                                              
			return fibonacci(n - 1) + fibonacci(n - 2); // Recursive calls 
	} // end method fibonacci
} // end class FibonacciTest
