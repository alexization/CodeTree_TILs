import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int OFFSET = 100000;

        char[] board = new char[2 * OFFSET + 1];
        int cur = OFFSET;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if (d == 'R') {
                for (int j = 0; j < x; j++) {
                    board[cur + j] = 'B';
                }
                cur = cur + x - 1;
            } else {
                for (int j = 0; j < x; j++) {
                    board[cur - j] = 'W';
                }
                cur = cur - x + 1;
            }
        }

        int white = 0;
        int black = 0;
        for (int i = 0; i <= 2 * OFFSET; i++) {
            if (board[i] == 0) continue;
            if (board[i] =='B') black++;
            else white++;
        }

        System.out.print(white + " " + black);
    }
}
