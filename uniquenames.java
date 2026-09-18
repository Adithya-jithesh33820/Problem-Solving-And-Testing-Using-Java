import java.util.*;
public class uniquenames {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String f = inp.next();
            String s = inp.next();
            String p = f + " " + s;
            set.add(p);
            System.out.println(set.size());
        }
        inp.close();
    }
}