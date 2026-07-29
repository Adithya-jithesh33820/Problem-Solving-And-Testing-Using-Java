import java.util.Scanner;
import java.util.Arrays;
public class binsearch {
    public static void main(String args[]){
        Scanner inp= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=inp.nextInt();//array size
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("enter array element: ");
            arr[i]=inp.nextInt();
        }
        Arrays.sort(arr);
        int x=inp.nextInt();//search element
        int beg=0;
        int end=n-1;
        int mid=(beg+end)/2;
        while(beg<=end){
            mid=(beg+end)/2;
            if(x==arr[mid]){
                System.out.println("Element found in array :)");
                break;
            }
            else if(x<arr[mid]){
                end=mid-1;
            }
            else if(x>arr[mid]){
                beg =mid+1;
            }
        }
        System.out.println("Element not in array");




        inp.close();
    }
}
