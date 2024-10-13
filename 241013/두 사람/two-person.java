import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int f_a = sc.nextInt();
        char f_g = sc.next().charAt(0);
        int s_a = sc.nextInt();
        char s_g = sc.next().charAt(0);

        if((f_a >= 19 && f_g == 'M') || (s_a >= 19 && s_g == 'M')) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}