import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int A_m = sc.nextInt();
        int A_e = sc.nextInt();
        int B_m = sc.nextInt();
        int B_e = sc.nextInt();

        if(A_m > B_m && A_e > B_e) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}