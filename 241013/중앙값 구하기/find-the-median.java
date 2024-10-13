import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int mid;

        if((a > b && a < c) || (a < b && a > c)) {
            mid = a; 
        } else if((a < b && b < c) || (a > b && b > c)) {
            mid = b;
        }  else {
            mid = c;
        }

        System.out.print(mid);
    }
}