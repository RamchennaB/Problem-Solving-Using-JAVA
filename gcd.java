class gcd{
    public static int HCF(int m,int n){
        while(m!=n){
            if(m > n){
                m=m-n;
            }
            else{
                n=n-m;            }
        }
        return m;
    }
    public static void main(String []args){
        int m=70, n=15;
        int g=HCF(m,n);
        System.out.println(g);
    }
}
