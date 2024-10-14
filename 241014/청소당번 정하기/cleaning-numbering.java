import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int classroom_cnt = 0, hallway_cnt = 0, bathroom_cnt = 0;

        for(int i = 0; i <= day; i++) {
            if(i > 0) {
                if(i % 12 == 0) {
                    bathroom_cnt++;
                } else if(i % 3 == 0) {
                    hallway_cnt++;
                } else if(i % 2 == 0) {
                    classroom_cnt++;
                }
            }
        }
        System.out.print(classroom_cnt + " " + hallway_cnt + " " + bathroom_cnt);
    }
}