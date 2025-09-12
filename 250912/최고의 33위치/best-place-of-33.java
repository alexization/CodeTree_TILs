import java.util.*;
import java.io.*;

public class Main {

    public static int[][] grid;
    public static int n;

    // 3*3 공간에 1의 개수 확인
    public static int countCoin(int x, int y) {
        int coin = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i+x][j+y] == 1) coin++;
            }
        }
        return coin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int result = Integer.MIN_VALUE;
        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= n - 3; j++) {
                result = Math.max(result, countCoin(i, j));
            }
        }

        System.out.println(result);
    }
}