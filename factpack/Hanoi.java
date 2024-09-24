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