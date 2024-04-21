public class minimum {
    public int mini(int arr[]){
        int n=arr.length;
        int min=arr[0];
        for(int i=0;i<n;i++){
             if(arr[i] < min){
                 min=arr[i];
             }
        }
    return min;
}
public static void main(String []args){
      minimum m=new minimum();
      int arr[]=new int[]{2,1,3,4,5};;
      int result=m.mini(arr);
      System.out.println(result);

    }
}
