import java.util.*;
public class deque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int maxUnique = map.size();
        for (int i = k; i < n; i++) {
            int outgoing = arr[i - k];
            map.put(outgoing, map.get(outgoing) - 1);
            if (map.get(outgoing) == 0) {
                map.remove(outgoing);
            }
            int incoming = arr[i];
            map.put(incoming, map.getOrDefault(incoming, 0) + 1);
            maxUnique = Math.max(maxUnique, map.size());
        }
        System.out.println(maxUnique);
        sc.close();
    }
}