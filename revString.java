import java.util.Scanner;
class revString{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.next();
        String s1=" ";
        char c;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            s1=c + s1;
        }
        System.out.println("reverse of a String is "+s1);
    }
}
