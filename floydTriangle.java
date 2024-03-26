import java.util.Scanner;
public class floydTriangle{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("how many rows of floyd triangle you want");
        n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("+"+" ");
                
            }
            System.out.println();
            
        }
    }
}   
