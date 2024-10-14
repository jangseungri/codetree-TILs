import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            int current = i;
            boolean isClap = false;

            if(current % 3 == 0) {
                isClap = true;
            } else {
                while(current > 0) {
                    int digit = current % 10;
                    if(digit == 3 || digit == 6 || digit == 9) {
                        isClap = true;
                        break;
                    }
                    current /= 10;
                }
            }

            if(isClap) {
                System.out.print(0 + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}