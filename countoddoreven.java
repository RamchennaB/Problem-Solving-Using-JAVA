import java.util.Scanner;
public class countoddoreven {
    public static void count(int arr[]) {
        int evencount = 0;
        int oddcount = 0;
        for (int i = 0; i < 5; i++) {
            if ((arr[i] & 1) == 1) {
                 oddcount++;
            } else {
                 evencount++;
            }

        }
        System.out.println("the count of even numbers is"+evencount);
        System.out.println("the count of odd numbers is"+oddcount);

    }

    public static void main(String []args){
        Scanner s=new Scanne(System.in);
        System.out.println("Enter the Size of an array");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.ou.println("Enter the Elements");
        for(int i=0;i<n;i++) arr[i]=s.nextInt();
        count(arr);
    }
}
