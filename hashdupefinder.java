import java.util.*;
public class hashdupefinder {
    public static boolean contdupe(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = inp.nextInt();
        }
        boolean sol = contdupe(nums);
        System.out.println(sol);
        inp.close();
    }
}