import java.util.Scanner;
import java.util.Arrays;
public class maxint {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=inp.nextInt();//array size
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("enter array element: ");
            arr[i]=inp.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Max element is "+arr[arr.length-1]);
        inp.close();
    }
}
