// Copyright 2025 Theodore Podewil
// GPL-3.0-or-later

/*
This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>. 
*/


package factpack;
//Solves Tower of Hanoi problem

public class Hanoi {
    public static void solve(int n) {
        move_disc(n, 'A', 'B', 'C');
    }

    private static void move_disc(int n, char src, char temp, char dest) {
        // recursive method to move discs
        if (n == 1) {
            System.out.println(String.format("Move %c -> %c", src, dest));
            return;
        }
        move_disc(n - 1, src, dest, temp);
        move_disc(1, src, temp, dest);
        move_disc(n - 1, temp, src, dest);
    }
}
