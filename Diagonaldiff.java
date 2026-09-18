import java.util.*;
public class Diagonaldiff {
    public static int ddiff(List<List<Integer>> arr) {
        int n = arr.size();
        int ldia = 0;
        int rdia = 0;
        for (int i = 0; i < n; i++) {
            ldia += arr.get(i).get(i);
            rdia += arr.get(i).get(n - 1 - i);
        }
        return Math.abs(ldia - rdia);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(inp.nextInt());
            }
            arr.add(row);
        }
        int diff = ddiff(arr);
        System.out.println(diff);
        inp.close();
    }
}