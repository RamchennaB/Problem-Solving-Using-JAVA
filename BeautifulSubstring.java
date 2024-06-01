import java.util.*;

class BeautifulSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();  

        for (int t = 0; t < T; t++) {
            String s = sc.nextLine();
            System.out.println(countBeautifulSubstrings(s));
        }
    }

    private static int countBeautifulSubstrings(String s) {
        int countA = 0, countB = 0, countC = 0;
        int beautifulCount = 0;
        int offset = s.length();
        int[][] differenceArray = new int[2 * offset + 1][2 * offset + 1];
        differenceArray[offset][offset] = 1;

        for (char ch : s.toCharArray()) {
            if (ch == 'a') {
                countA++;
            } else if (ch == 'b') {
                countB++;
            } else if (ch == 'c') {
                countC++;
            }

            int diffAB = countA - countB + offset;
            int diffAC = countA - countC + offset;

            beautifulCount += differenceArray[diffAB][diffAC];
            differenceArray[diffAB][diffAC]++;
        }

        return beautifulCount;
    }
}
