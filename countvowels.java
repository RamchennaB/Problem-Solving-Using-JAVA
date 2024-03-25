import java.util.Scanner;
class countvowels{ 
         
    static boolean isVowel(char ch) 
    { 
        ch = Character.toUpperCase(ch); 
        return (ch=='A' || ch=='E' || ch=='I' || 
                           ch=='O' || ch=='U'); 
    } 
       
    static int countVowels(String str) 
    { 
        int count = 0; 
        for (int i = 0; i < str.length(); i++) 
            if (isVowel(str.charAt(i))) // Check for vowel 
                ++count; 
        return count; 
    } 
       
    public static void main(String args[]) 
    { 
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=s.next();
        System.out.println(countVowels(str)); 
    } 
} 
