import java.util.Random;
import java.util.Scanner;

// Implement the algorithm to convert Euro to Dollars

// We implement it as a series of modules, coordinated 
// and called from main

public class GeneratePasswordModules {
    public static void main(String[] args) {
    	
        // Get the input from a function
        int pwd_len = getN();


        String password = generatePassword(pwd_len);

        // Display the result
        printPassword(password);
    }

    // A function to get the input
    public static int getN(){
        int N;

        // Get the input.. need to wrap Scanner in try()
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter Number of letters: ");
            N = scanner.nextInt();
        }

        return(N);
    }

    // A function to process the input
    public static String generatePassword(int N){

        char[] pwd = new char[N];

        if(N < 3)
            return "Error, N must be at least 3";

        for (int i = 0; i < N; i++) {
            String choice = getRandomChoice();

            if (choice == "Digit")
                pwd[i] = getRandomDigit();
            else if (choice == "Upper")
                pwd[i] = getRandomUpper();
            else if (choice == "Lower")
                pwd[i] = getRandomLower();
            else 
                pwd[i] = '?';
        }

        return(String.valueOf(pwd));
    }

    public static char getRandomUpper(){
        Random r = new Random();
        int n = r.nextInt(26);
        return (char) ('A'+ n);
    }

        public static char getRandomLower(){
        Random r = new Random();
        int n = r.nextInt(26);
        return (char) ('a'+ n);
    }

       public static char getRandomDigit(){
        Random r = new Random();
        int n = r.nextInt(10);
        return (char) ('0'+ n);
    }

    public static String getRandomChoice(){
        Random r = new Random();

        int r_int = r.nextInt(3);

        if(r_int == 0)
            return "Digit";
        else if (r_int == 1)
            return "Upper";
        else 
            return "Lower";

    }

    // A function to display the output
    public static void printPassword(String pwd){
        System.out.println("The password =  " + pwd);
    }
}
