import java.util.*;
import java.io.*;

public class Main {
    public static char[] d = new char[1000];
    public static int[] t = new int[1000];
    public static char[] d2 = new char[1000];
    public static int[] t2 = new int[1000];

    static final int MAX_TIME = 1000 * 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] firstPos = new int[MAX_TIME + 1];
        int[] secondPos = new int[MAX_TIME + 1];

        int time = 0;
        for (int i = 0; i < n; i++) {
            d[i] = sc.next().charAt(0);
            t[i] = sc.nextInt();

            for (int j = time; j < time + t[i]; j++) {
                move(d[i], j, firstPos);
            }

            time += t[i];
        }

        time = 0;
        for (int i = 0; i < m; i++) {
            d2[i] = sc.next().charAt(0);
            t2[i] = sc.nextInt();

            for (int j = time; j < time + t2[i]; j++) {
                move(d2[i], j, secondPos);
            }

            time += t2[i];
        }

        boolean isMeeting = false;
        for (int i = 0; i < time; i++) {
            if (firstPos[i] == secondPos[i]) {
                isMeeting = true;
                System.out.println(i + 1);
                break;
            }
        }

        if (!isMeeting) System.out.println(-1);
    }

    static void move(char dir, int time, int[] posArr) {
        if (dir == 'L') {
            if (time == 0) posArr[time] = -1;
            else posArr[time] = posArr[time - 1] - 1;

        } else {
            if (time == 0) posArr[time] = 1;
            else posArr[time] = posArr[time - 1] + 1;
        }
    }
}