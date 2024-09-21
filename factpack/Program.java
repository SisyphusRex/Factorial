package factpack;

// System Imports
import java.util.Scanner;
// First Party Imports

// Third Party Imports

public class Program {
    private static int MAX_MENU = 3;

    public static void run() {
        // Method to run program
        // Factorial factorial = new Factorial();
        Scanner myObj = new Scanner(System.in);
        String s = """
                Enter:
                1 for Factorial,
                2 for Tower of Hanoi,
                3 to Exit.
                """;
        System.out.println(s);
        int choice = myObj.nextInt();
        while (choice < MAX_MENU) {
            if (choice == 1) {
                // Produce a factorial result
                System.out.println("Give me a number to factorial:");
                int number = myObj.nextInt();
                int solved = MyFactorial.solve(number);
                System.out.println(solved);
            }
            if (choice == 2) {
                // produce a Tower of Hanoi result

                // this choice must be implemented
                System.out.println("Must implement this first.")
            }
        }
        myObj.close();

    }
}