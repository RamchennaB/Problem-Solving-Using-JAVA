import java.util.Scanner;
class BubbleSort{
    public static void bubblesort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Array Before Sorting");
        printarray(arr);
        //sorting
        bubblesort(arr);
        System.out.println("Array After Sorting");
        printarray(arr);

    }
    public static void printarray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
