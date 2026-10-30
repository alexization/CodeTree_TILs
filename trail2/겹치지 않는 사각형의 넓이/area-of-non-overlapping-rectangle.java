import java.util.Scanner;
public class Main {

    static final int OFFSET = 1000;
    static final int MAX = 2 * OFFSET;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] board = new boolean[MAX][MAX];

        for (int i = 0 ; i < 2; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    board[j][k] = true;
                }
            }
        }

        int mx1 = sc.nextInt() + OFFSET;
        int my1 = sc.nextInt() + OFFSET;
        int mx2 = sc.nextInt() + OFFSET;
        int my2 = sc.nextInt() + OFFSET;

        for (int i = mx1; i < mx2; i++) {
            for (int j = my1; j < my2; j++) {
                board[i][j] = false;
            }
        }

        int result = 0;
        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {
                if (board[i][j]) result++;
            }
        }

        System.out.println(result);
    }
}
