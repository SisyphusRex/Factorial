// Program file, where the main logic lies

// System Imports
import java.util.Scanner;
// First Party Imports

// Third Party Imports

public class Program {
    public static void run() {
        // Method to run program
        // Factorial factorial = new Factorial();
        Scanner myObj = new Scanner(System.in);
        String s = """
                Enter 1 for Factorial,
                2 for Tower of Hanoi,
                3 to Exit.
                """;
        System.out.println(s);
        int choice = myObj.nextInt();
        while (choice < 3) {
            if (choice == 1) {
                System.out.println("Give me a number to factorial:");
                int number = myObj.nextInt();
                int solved = MyFactorial.solve(number);
                System.out.println(solved);
            }
        }

    }
}