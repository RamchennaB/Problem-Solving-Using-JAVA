public class countoddoreven {
    public static void count(int arr[]) {
        int evencount = 0;
        int oddcount = 0;
        for (int i = 0; i < 5; i++) {
            if ((arr[i] & 1) == 1) {
                 oddcount++;
            } else {
                 evencount++;
            }

        }
        System.out.println("the count of even numbers is"+evencount);
        System.out.println("the count of odd numbers is"+oddcount);

    }

    public static void main(String []args){
        int arr[]=new int[]{2,4,6,8,10};;
        count(arr);
    }
}
