import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        int std = sc.nextInt();
        int front = sc.nextInt();
        int back = sc.nextInt();
        int temp;

        temp = front;
        front = back;
        back = temp;

        System.out.print("010-" + front + "-" + back);
    }
}