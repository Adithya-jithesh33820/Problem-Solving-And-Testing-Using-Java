import java.util.*;
public class albob {
    public static List<Integer> comptrip(List<Integer> a, List<Integer> b) {
        int al = 0;
        int bob = 0;
        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                al++;
            } 
            else if (a.get(i) < b.get(i)) {
                bob++;
            }
        }
        return Arrays.asList(al, bob);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a.add(inp.nextInt());
        }
        for (int i = 0; i < 3; i++) {
            b.add(inp.nextInt());
        }
        List<Integer> sol = comptrip(a, b);
        System.out.println(sol.get(0) + " " + sol.get(1));
        inp.close();
    }
}