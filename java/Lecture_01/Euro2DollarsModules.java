import java.util.Scanner;

// Implement the algorithm to convert Euro to Dollars

// We implement it as a series of modules, coordinated 
// and called from main

public class Euro2DollarsModules {
    public static void main(String[] args) {
    	
        // Get the input from a function
        double euro = getEuro();

        // Call function to convert to dollars
        // Pass in the conversion rate
        double dollars = convert2Dollars(euro, 1.14770205);

        // Display the result
        printDollars(dollars);
    }

    // A function to get the input
    public static double getEuro(){
        double euro;

        // Get the input.. need to wrap Scanner in try()
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter Euro Value: ");
            euro = scanner.nextDouble();
        }

        return(euro);
    }

    // A function to process the input
    public static double convert2Dollars(double euro, double er){

        return(euro*er);
    }

    // A function to display the output
    public static void printDollars(double dollars){
        System.out.println("The dollar value =  " + dollars);
    }
}
