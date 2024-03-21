import java.util.Scanner;
class Fibonacci{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the series");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+b);
        int c=0;
        for(int i=0;i<n;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}