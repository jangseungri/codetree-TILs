import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(a / b + ".");
        a = a % b;
        a *= 10;

        for(int i = 1; i < 21; i++) {
            System.out.print(a / b);
            a = a % b;
            a *= 10;
        }
    }
}