import java.util.Scanner;
public class reverseArrayofString{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=s.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
                arr[i]=s.next();
         }
         System.out.println("\n");
         int S=0;
         int e=n-1;
         while(S < e){
             String temp=arr[S];
             arr[S]=arr[e];
             arr[e]=temp;
             S++;
             e--;
         }
         for(int i=0;i<n;i++){
               System.out.println(arr[i]);
         }
    }
}
