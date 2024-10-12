import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double leftSight = sc.nextDouble();
        double rightSight = sc.nextDouble();

        if(leftSight >= 1.0 && rightSight >= 1.0) {
            System.out.print("High");
        } else if(leftSight >= 0.5 && rightSight >= 0.5) {
            System.out.print("Middle");
        } else {
            System.out.print("Low");
        }
    }
}