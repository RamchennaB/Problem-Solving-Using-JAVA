import java.util.*;
class diff{
    public static int diffOfNum(int m,int n){
        int sum_divisible=0;
        int sum_notdivisible=0;
        for(int i=1;i<=n;i++)
        {
            if(i%m==0){
                sum_divisible+=i;
            }
            else{
                sum_notdivisible+=i;
            }
        }
        return  sum_notdivisible - sum_divisible;

    }
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        System.out.println(diffOfNum(m,n));
    }
}
