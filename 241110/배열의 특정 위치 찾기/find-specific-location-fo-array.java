import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for(int i = 0; i < 10; i++)
            arr[i] = sc.nextInt();

        int sum_1 = 0;
        for(int i = 1; i < 10; i += 2) {
            sum_1 += arr[i];
        }
        System.out.print(sum_1 + " ");

        int sum_2 = 0;
        int cnt = 0;
        for(int i = 2; i < 10; i += 3) {
            sum_2 += arr[i];
            cnt++;
        }

        double avg = (double)sum_2 / cnt;
        System.out.printf("%.1f", avg);
    }
}