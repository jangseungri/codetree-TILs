import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a, t_cnt = 0, f_cnt = 0;

        for(int i = 0; i < 10; i++) {
            a = sc.nextInt();
            
            if(a % 3 == 0) {
                t_cnt++;
            }
            if(a % 5 == 0) {
                f_cnt++;
            }
        }

        System.out.print(t_cnt + " " + f_cnt);
    }
}