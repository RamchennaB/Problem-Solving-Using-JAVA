import java.util.ArrayList;
import java.util.Collections;
class large{
    public static int largeofSum (int arr[]){
         if(arr.length < 4){
             return 0;
         }
         ArrayList<Integer> evenList=new ArrayList<>();
         ArrayList<Integer> oddList=new ArrayList<>();
         
         for(int i=0;i<arr.length;i++){
             if(i%2 == 0){
                 evenList.add(arr[i]);
             }
             else{
                 oddList.add(arr[i]);
             }
         }
         if(evenList.size() < 2 && oddList.size() < 2){
             return 0;
         }
         
        Collections.sort(evenList);
        Collections.sort(oddList);
        
        int evensec=evenList.get(evenList.size() - 2);
        int oddsec=oddList.get(1);
        
        return evensec + oddsec;
        
    }
    public static void main(String []args){
        int arr[]={1,2,3,5,4,6,7};
       System.out.println(largeofSum(arr));
    }
}
