import java.util.Scanner;

// Implement the algorithm to convert Euro to Dollars
public class Euro2Dollars {
    public static void main(String[] args) {
    	
        // Create the variable to store the input
        double euro;

        // Get the input.. need to wrap Scanner in try()
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter Euro Value: ");
            euro = scanner.nextDouble();
        }

        // Convert to dollars
        // Note it's a fixed conversion rate
        double dollars = euro * 1.14770205;

        // Display the result
        System.out.println("The dollar value =  " + dollars);
    }
}
