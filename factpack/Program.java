// Copyright 2025 Theodore Podewil
// GPL-3.0-or-later

/*
This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>. 
*/


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
                System.out.println("Give me the number of discs: ");
                int number = myObj.nextInt();
                Hanoi.solve(number);
                // this choice must be implemented
                System.out.println("");

            }
            System.out.println(s);
            choice = myObj.nextInt();
        }
        myObj.close();

    }
}
