class maximum { 
    public int maxi(int arr[]){
        int n=arr.length;
        int max=arr[0];
        for(int i=0;i<n;i++){
             if(arr[i] > max){
                 max=arr[i];
             }
        }
    return max;
}
public static void main(String []args){
      maximum m=new maximum();
      int arr[]=new int[]{2,1,3,4,5};;
      int result=m.maxi(arr);
      System.out.println(result);
    }
}
