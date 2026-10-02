public class Factorial {
	public static void main (String args[]) {
		int val = 4;
		int facval = factorial(val);
		System.out.println("The factorial of " + val + " is " + facval);
	}

	public static int factorial(int n)
	{
        System.out.println("Calling factorial with n = " + n);
		if (n < 0) {
			System.out.println("ERROR: undefined for negative values " + n);
			return -999;  // or System.exit(0);
		}
		if (n == 0 || n == 1) {
            System.out.println("Arrived at terminating condition...");
			return 1;
		}

        int ans = n * factorial(n-1);
        System.out.println("Returning a value of " + ans);
		return (ans);
	}
}

