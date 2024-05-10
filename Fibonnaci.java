import java.util.Scanner;
class Fibonacci{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the series");
        int n=sc.nextInt();
        int f1=0;
        int f2=1;
        System.out.print(f1+" "+f2);
        int f3=0;
        for(int i=0;i<n;i++){
            f3=f1+f2;
            System.out.print(" "+f3);
            f1=f2;
            f2=f3;
        }
    }
}
