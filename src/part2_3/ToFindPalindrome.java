package part2_3;

import java.util.Scanner;

public class ToFindPalindrome {
    public static boolean palindromeOrNot(StringBuilder str1){
        boolean answer = false;
        String first = str1.toString();
        str1.reverse();
        if (first.equals(str1.toString())){
            answer = true;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        StringBuilder str1 = new StringBuilder(s);
        boolean isIt = palindromeOrNot(str1);
        System.out.println(isIt);
    }
}
