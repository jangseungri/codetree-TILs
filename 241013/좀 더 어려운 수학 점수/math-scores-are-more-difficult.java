import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int A_M = sc.nextInt();
        int A_E = sc.nextInt();
        int B_M = sc.nextInt();
        int B_E = sc.nextInt();

        if(A_M == B_M) {
            System.out.print(A_E > B_E ? 'A' : 'B');
        } else {
            System.out.print(A_M > B_M ? 'A' : 'B');
        }
    }
}