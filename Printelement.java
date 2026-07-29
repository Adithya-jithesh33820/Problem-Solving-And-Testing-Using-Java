import java.util.Scanner;
public class Printelement {
    public static void main(String args[]){       
        Scanner inp= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=inp.nextInt();//array size
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("enter array element: ");
            arr[i]=inp.nextInt();
        }
        int x=inp.nextInt();//search index
        System.out.println(arr[x-1]);

        inp.close();
}

}
