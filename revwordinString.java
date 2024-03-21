import java.util.Scanner;
class revwordinString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String s=sc.nextLine();
        String res="";
        String s1[]=s.split(" ");
        for(int i=s1.length-1;i>=0;i--)
        {
          res += s1[i]+" ";
        }
        System.out.println(res);
}
}