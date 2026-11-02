import java.util.*;
import java.io.*;

public class Main {

    static final int OFFSET = 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[][] boards = new boolean[2 * OFFSET + 1][2 * OFFSET + 1];
        boolean isSecondSquare = false;
        for (int i = 0; i < 2; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    if (isSecondSquare) boards[y][x] = false;
                    else boards[y][x] = true;
                }
            }
            isSecondSquare = true;
        }

        int x1 = Integer.MAX_VALUE;
        int y1 = Integer.MAX_VALUE;
        int x2 = Integer.MIN_VALUE;
        int y2 = Integer.MIN_VALUE;
        boolean isNone = true;
        for (int y = 0; y <= 2 * OFFSET; y++) {
            for (int x = 0; x <= 2 * OFFSET; x++) {
                if (boards[y][x]) {
                    isNone = false;
                    x1 = Math.min(x1, x);
                    y1 = Math.min(y1, y);
                    x2 = Math.max(x2, x);
                    y2 = Math.max(y2, y);
                }
            }
        }
        if (isNone) System.out.println(0);
        else System.out.println((x2 - x1 + 1) * (y2 - y1 + 1));
    }
}
