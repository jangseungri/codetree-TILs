import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] countArr = new int[b];
        int sum = 0;

        while(a > 1) {
            int result = a % 4;
            countArr[result]++;
            a /= 4;
        }

        for(int i = 0; i < b; i++) {
            sum += countArr[i] * countArr[i];
        }

        System.out.print(sum);
    }
}