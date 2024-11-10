import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int o_sum = 0;
        int e_sum = 0;

        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            if(i % 2 == 0)
                o_sum += arr[i];
            else
                e_sum += arr[i];
        }

        if(o_sum >= e_sum)
            System.out.print(o_sum - e_sum);
        else   
            System.out.print(e_sum - o_sum);
    }
}