import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char a_s = sc.next().charAt(0);
        int a_t = sc.nextInt();
        char b_s = sc.next().charAt(0);
        int b_t = sc.nextInt();
        char c_s = sc.next().charAt(0);
        int c_t = sc.nextInt();

        if(a_s == 'Y' && a_t >= 37) {
            if((b_s == 'Y' && b_t >= 37) || (c_s == 'Y' && c_s >= 37)) {
                System.out.print('E');
            } else {
                System.out.print('N');
            }
        } else {
            if((b_s == 'Y' && b_t >= 37) && (c_s == 'Y' && c_s >= 37)) {
                System.out.print('E');
            } else {
                System.out.print('N');
            }
        }
    }
}