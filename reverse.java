import java.util.Scanner;

public class reverse {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++) arr[i]=s.nextInt();
        int start=0;
        int end=4;
        while(start < end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
         }
        for(int i=0;i<n;i++) System.out.println(arr[i]+ "");
    }
}

