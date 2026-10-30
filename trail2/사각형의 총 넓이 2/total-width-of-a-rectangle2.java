import java.util.Scanner;
public class Main {

    static final int OFFSET = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];

        int[][] board = new int[2 * OFFSET + 1][2 * OFFSET + 1];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();

            int width = x2[i] - x1[i] + OFFSET;
            int height = y2[i] - y1[i] + OFFSET;
            for (int m = y1[i] + OFFSET; m < y2[i] + OFFSET; m++) {
                for (int k = x1[i] + OFFSET; k < x2[i] + OFFSET; k++) {
                    board[m][k]++;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < 2 * OFFSET + 1; i++) {
            for (int j = 0; j < 2 * OFFSET + 1; j++) {
                if (board[i][j] >= 1) result++;
            }
        }
        System.out.println(result);
    }
}
