class fizzBuzz{
    public void fizz(int n){
        for(int i=1;i<=n;i++){
            if(i%3 == 0&& i%5==0){
                System.out.println("FizzBuzz");
            }
            if(i%3==0 && i%5!=0){
                System.out.println("fizz");
            }
            if(i%3!=0&&i%5==0){
                System.out.println("Buzz");
            }
            if(i%3!=0&&i%5!=0){
             System.out.println(i);
            }
        }
    }
    public static void main(String []args){
       fizzBuzz f=new fizzBuzz();
       f.fizz(15);
    }
