import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n * 2; i++) {
            if(i % 2 == 0) {
                for(int j = 0; j < n - (i / 2); j++)
                    System.out.print("* ");
            }
            else {
                for(int j = 0; j < i - (i / 2); j++)
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}