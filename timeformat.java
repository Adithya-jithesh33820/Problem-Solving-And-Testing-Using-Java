import java.util.*;
public class timeformat {
    public static String timeconvo(String s) {
        String period = s.substring(8, 10);
        int hour = Integer.parseInt(s.substring(0, 2));
        if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else {
            if (hour != 12) {
                hour = hour + 12;
            }
        }
        String minutesSeconds = s.substring(2, 8);
        return String.format("%02d", hour) + minutesSeconds;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = timeconvo(s);
        System.out.println(result);
        sc.close();
    }
}