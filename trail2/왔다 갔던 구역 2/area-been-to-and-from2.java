import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[2001];
        int curIndex = 1000;
        
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            // Please write your code here.

            if (dir == 'R') {
                for (int j = curIndex; j < curIndex + x; j++) {
                    arr[j]++;
                }
                curIndex += x;
            } else {
                for (int j = curIndex - x; j < curIndex; j++) {
                    arr[j]++;
                }
                curIndex -= x;
            }
        }

        int result = 0;
        for (int i = 0; i < 2001; i++) {
            if (arr[i] >= 2) result++;
        }
        System.out.print(result);
    }
}