class missingNum {
    public static int missNum(int arr[]){
        int n=arr.length + 1;
        int sum=n*(n+1)/2;
        for(int i:arr){
            sum-=i;
        }
        return sum;
    }
    public static void main(String []args){
        int arr[]=new int[]{3,2,1,5};;
        int m = missNum(arr);
        System.out.println("the missing number:"+m);
    }
}
