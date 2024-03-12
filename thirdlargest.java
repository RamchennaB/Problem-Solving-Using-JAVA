public class thirdlargest {
    public static void main(String[] args){
        int arr[]=new int[]{1,3,4,2,5};;
        int first=0;
        int second=0;
        int third=0;
        for(int i=0;i<5;i++) {
            if (arr[i] > first) {
                third=second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                third=second;
                second = arr[i];
            } else if (arr[i] > third)
                third=arr[i];
            }

            System.out.println(third);


    }
}
