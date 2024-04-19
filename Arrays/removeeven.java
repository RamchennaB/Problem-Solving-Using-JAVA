import java.util.Scanner;
class removeeven {
    public static int[] removeEven(int arr[]) {
        int oddCount = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        int result[] = new int[oddCount];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Value of N");
        int n=s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)  arr[i]=s.nextInt();
        int result[] = removeEven(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
