import java.util.Scanner;
class revfloydtriangle{
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of rows you want");
    int n=s.nextInt();
    for(int i=0;i<n;i++){
        for(int j=n;j>i;j--){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
    }
}
