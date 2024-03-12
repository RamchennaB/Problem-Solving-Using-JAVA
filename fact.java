import java.util.Scanner;

public class fact {
    public static int factorial(int n)
    {  if(n == 0){
         return 1;
        }
        else if (n == 1) {
            return n;
        }
        else{
            return n*factorial(n-1);
    }

    }

    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int result=factorial(n);
        System.out.println("the factorial of "+n+" is :"+result);
    }
}
