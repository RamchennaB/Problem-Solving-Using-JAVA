import java.util.Scanner;
class selectionsort{
    public static void SelectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex=j;
                }
            }
         int temp=arr[minIndex];
         arr[minIndex]=arr[i];
         arr[i]=temp;
        }
    }
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter the size of an array");
        int n=s.nextInt();
        
        System.out.println("Enter the array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=s.nextInt();
        
        System.out.println("Array before  Sorting");
        printarray(arr);
        
        SelectionSort(arr);
        
        System.out.println("Array after Sorting");
        printarray(arr);
        
        
    }
    public static void printarray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
