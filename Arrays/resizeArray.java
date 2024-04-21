public class resizeArray {
    public static int[] resize(int arr[],int capacity){
        int n=arr.length;
        int temp[]=new int[capacity];
        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }
        arr=temp;
        return arr;
    }
    public static void main(String []args){
        int arr[]=new int[]{3,2,4,5};;
        int temp[]=resize(arr,arr.length*2);
        System.out.println(temp.length);
    }
}
