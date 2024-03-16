import java.util.Scanner;
public class swapwotemp{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Value of a and b");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("a="+a+"b="+b);
        //swap two variable without using third variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+"b="+b);
    }
    }
