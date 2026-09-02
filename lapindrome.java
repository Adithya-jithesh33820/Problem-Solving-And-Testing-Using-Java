import java.util.*;

public class  lapindrome{

    public static boolean isLapindrome(String s) {
        int n = s.length();
        int[] left = new int[26];
        int[] right = new int[26];
        for (int i = 0; i < n / 2; i++) {
            left[s.charAt(i) - 'a']++;
        }
        for (int i = (n + 1) / 2; i < n; i++) {
            right[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (left[i] != right[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        while (n-- > 0) {
            String str = inp.next();
            if (isLapindrome(str)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        inp.close();
    }
}