class occurneceOfDigit{
    public static void main(String []args){
        
        int num=8989898,count=0;
        char c='8';
        String nums=Integer.toString(num);
        for(int i=0;i<nums.length();i++){
            if(nums.charAt(i) == c){
                count++;
            }
        }
        System.out.println(count);
    }
}
