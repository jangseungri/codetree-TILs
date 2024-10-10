public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        double a_ft = 9.2;
        double a_cm = a_ft * 30.48;
        double b_mi = 1.3;
        double b_cm = b_mi * 160934;

        System.out.printf("%.1fft = %.1fcm\n", a_ft, a_cm);
        System.out.printf("%.1fmi = %.1fcm", b_mi, b_cm);
    }
}