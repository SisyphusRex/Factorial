package factpack;
// Factorial class

// System Imports

// First Party Imports

// Third Party Imports

public class MyFactorial {
    // Class for Solving Factorial
    public static int solve(int number) {
        // Solve Factorial Method
        if (number == 1) {
            return number;
        }
        int result = solve(number - 1);

        return (number * result);
    }

}