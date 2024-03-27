import java.util.Scanner;
public class binarySearch{
    public static int binary_search(int arr[],int target,int n){
        int low=1;
        int high=arr.length - 1;
        
            int mid=low+(high-low)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                return mid-1;
            }
            else if(arr[mid] < target){
                 return mid+1;
            }
         return -1;
    }
  public static void main(String []args){
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the array size");
      int n=s.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter the array elements");
      for(int i=0;i<n;i++) arr[i]=s.nextInt();
      System.out.println("Enter the target element");
      int target=s.nextInt();
      int result=binary_search(arr,target,n);
      if(result == -1){
         System.out.println("Element not found");
      }
      else{
          System.out.println("Element found at index "+result);
      }
      
  }
}
