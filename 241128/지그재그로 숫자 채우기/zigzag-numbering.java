import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        int cnt = 0;

        for(int j = 0; j < m; j++) {
            if(j % 2 == 0) {
                for(int i = 0; i < n; i++) {
                    arr[i][j] = cnt;
                    cnt++;
                }
            }
            else {
                for(int i = n - 1; i >= 0; i--) {
                    arr[i][j] = cnt;
                    cnt++;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}