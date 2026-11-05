import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int count = 0;
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > t) count++;
            else count = 0;

            result = Math.max(result, count);
        }

        System.out.println(result);
    }
}
