import java.util.Scanner;
import java.util.Arrays;
public class smallkelement {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=inp.nextInt();//array size
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("enter array element: ");
            arr[i]=inp.nextInt();
        }
        System.out.printf("Enter element: ");
        int k=inp.nextInt();
        Arrays.sort(arr);
        System.out.printf("The %dth smalles element is %d",k,arr[k-1]);
        inp.close();
    }
}
