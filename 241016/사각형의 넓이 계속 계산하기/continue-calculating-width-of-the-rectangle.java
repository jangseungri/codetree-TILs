import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        while(true) {
            int w, h;
            char a;
            w = sc.nextInt();
            h = sc.nextInt();
            a = sc.next().charAt(0);

            System.out.println(w * h);

            if(a == 'C')
                break;
        }
    }
}