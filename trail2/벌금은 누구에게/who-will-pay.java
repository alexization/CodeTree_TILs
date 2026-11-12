import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] remainCount = new int[n + 1];
        Arrays.fill(remainCount, k);

        int result = -1;
        for (int i = 0; i < m; i++) {
            int penalizedPerson = sc.nextInt();
            if (remainCount[penalizedPerson] == 1) {
                result = penalizedPerson;
                break;
            } else {
                remainCount[penalizedPerson] -= 1;
            }
        }

        System.out.println(result);
    }
}
