import java.util.Scanner;
public class Main {

    static final int OFFSET = 100;
    static final int SIZE = 2 * OFFSET + 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] boards = new int[SIZE][SIZE];
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            // Red -> 1, Blue -> 2
            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    if (i % 2 == 0) boards[y][x] = 1;
                    else boards[y][x] = 2;
                }
            }
        }
        
        int area = 0;
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                if (boards[y][x] == 2) area++;
            }
        }

        System.out.println(area);
    }
}
