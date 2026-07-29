import java.util.Scanner;
//import java.util.Arrays;
public class pairprint {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=inp.nextInt();//array size
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("enter array element: ");
            arr[i]=inp.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("(%d,%d)",arr[i],arr[j]);
                System.out.printf("::");

            }
        }


        inp.close();
    }
}
