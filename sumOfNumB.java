public class sumofNumB {
    public static int sum(int m,int n){
        int su=0;
        for(int i=m;i<n;i++)
            if(i%3==0 && i%5==0){
                su=su+i;
            }
        
        return su;
    }
    
    public static void main(String []args){
        int m=12;
        int n=50;
        System.out.print(sum(m,n));
    }
}
