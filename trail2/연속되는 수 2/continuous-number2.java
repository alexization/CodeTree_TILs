import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxResult = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || arr[i - 1] == arr[i]) count++;
            else {
                maxResult = Math.max(maxResult, count);
                count = 1;
            }
        }

        maxResult = Math.max(maxResult, count);
        System.out.println(maxResult);
    }
}