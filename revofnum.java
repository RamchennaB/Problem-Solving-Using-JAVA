import java.util.Scanner;
class revofnum{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number to reverse");
        int a=s.nextInt();
        int rev=0;
        int temp=a;
        while(a>0){
            int original=a%10;
            rev=(rev*10)+original;
            a=a/10;
        }
        
        System.out.println("the reverse of num"+a+"is "+rev);
    }
    }
