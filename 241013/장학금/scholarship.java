import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int midterm_score = sc.nextInt();
        int final_score = sc.nextInt();

        if(midterm_score >= 90) {
            if(final_score >= 95) {
                System.out.print(100000);
            } else if(final_score >= 90) {
                System.out.print(50000);
            } else {
                System.out.print(0);
            }
        } else {
            System.out.print(0);
        }
    }
}