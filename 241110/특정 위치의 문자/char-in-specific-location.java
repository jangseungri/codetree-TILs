import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        char[] word = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};

        int idx = -1;

        Scanner sc = new Scanner(System.in);
        int n = sc.next().charAt(0);

        for(int i = 0; i < 6; i++)
            if(word[i] == n)
                idx = i;

        if(idx == -1)
            System.out.print("None");
        else
            System.out.print(idx);
    }
}