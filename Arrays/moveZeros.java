public class moveZeros {
    public static void move(int arr[]) {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String []args){
        int arr[]=new int[]{2,1,0,3,0,4};;
        move(arr);
    }
}
