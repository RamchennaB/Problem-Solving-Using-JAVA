import java.util.Scanner;
public class linearSearch{
    public static int linear_search(int arr[],int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == target){
                return i;
            }
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
      int result=linear_search(arr,target);
      if(result == -1){
         System.out.println("Element not found");
      }
      else{
          System.out.println("Element found at index "+result);
      }
      
  }
}
