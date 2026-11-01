import java.util.Scanner;
public class Main {

    static final int OFFSET = 100;
    static final int SIZE = 2 * OFFSET + 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[][] boards = new boolean[SIZE][SIZE];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt() + OFFSET;
            int y = sc.nextInt() + OFFSET;

            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 8; k++) {
                    boards[y + j][x + k] = true;
                }
            }
        }
        
        int result = 0;
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                if (boards[y][x]) result++;
            }
        }

        System.out.println(result);
    }
}