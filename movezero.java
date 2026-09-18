import java.util.Arrays;
import java.util.Scanner;
public class movezero {
    public static void movz(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[n];
                nums[n] = temp;
                n++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n =inp.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=inp.nextInt();
        }
        movz(nums);
        System.out.println(Arrays.toString(nums));
        inp.close();
    }
}