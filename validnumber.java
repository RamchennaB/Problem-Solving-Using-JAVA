import java.util.Scanner;

public class validnumber {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your mobile number");
        long N=s.nextLong();
        int check=String.valueOf(N).length();
        if(check == 10){
            System.out.println("Valid Number");
        }
        else{
            System.out.println("Not a valid number");
        }
    }
}
