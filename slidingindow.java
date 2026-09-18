import java.util.*;
public class slidingindow {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int m = inp.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }
        Deque<Integer> deq = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();
        int un = 0;
        for (int i = 0; i < n; i++) {
            deq.addLast(arr[i]);
            set.add(arr[i]);
            if (deq.size() > m) {
                int removed = deq.removeFirst();
                if (!deq.contains(removed)) {
                    set.remove(removed);
                }
            }
            if (deq.size() == m) {
                un = Math.max(un, set.size());
            }
        }
        System.out.println(un);
        inp.close();
    }
}