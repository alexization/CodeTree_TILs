import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        char[] dir = new char[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            dir[i] = sc.next().charAt(0);
        }

        char[] board = new char[200001];
        int[] whiteCount = new int[200001];
        int[] blackCount = new int[200001];
        int cur = 100000;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x[i]; j++) {
                if (dir[i] == 'R') {
                    int now = cur + j;
                    if (board[now] == 'G') continue;

                    blackCount[now]++;
                    if (blackCount[now] >= 2 && whiteCount[now] >= 2) board[now] = 'G';
                    else board[now] = 'B';
                } else {
                    int now = cur - j;
                    if (board[now] == 'G') continue;

                    whiteCount[now]++;
                    if (blackCount[now] >= 2 && whiteCount[now] >= 2) board[now] = 'G';
                    else board[now] = 'W';
                }
            }

            if (dir[i] == 'R') cur += x[i] - 1;
            else cur = cur - x[i] + 1;
        }

        int white = 0;
        int black = 0;
        int gray = 0;
        for (int i = 0; i < 200001; i++) {
            if (board[i] == 'W') white++;
            else if (board[i] == 'B') black++;
            else if (board[i] == 'G') gray++;
        }

        System.out.print(white + " " + black + " " + gray);
    }
}
