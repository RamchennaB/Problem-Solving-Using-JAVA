class insertionsort{
    public static void InsertionSort{
       int n= arr.length;
       for(int i=0;i<n-1;i++){
           int key=arr[i];
           int j=i-1;
           while(j>=0 && arr[j] > key){
               if(arr[j-1] > arr[j]){
                   arr[j+1]=arr[j];
                   j-=1;
               }
           }
           arr[j-1]=key;
       }
   }
   public static void main(String []args){
       int n=5;
       int arr[]=new int[]{5,7,6,8,4};;
       InsertionSort(arr);
       for(int i=0;i<n;i++){
       System.out.print(arr[i]+ " ");
       }
   }
}