import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;

        while(N != 1) {
            N /= 2;
            cnt++;
        }
        
        System.out.print(cnt);
    }
}