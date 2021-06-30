package part2_9;

import java.util.Scanner;

public class CountLettersWithUpperAndLowerCase {
    /*public static int counterUpper(String line) {
        int resUpper = 0;
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                resUpper++;
        }
        return resUpper;
    }

    public static int counterLower(String line) {
        int resLower = 0;
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                resLower++;
        }
        return resLower;
    }*/

    public static int countLetter(String line, boolean isUpper) {
        int count = 0;

        char left = isUpper ? 'A': 'a';
        char right = isUpper ? 'Z' : 'z';

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c >= left && c <= right) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        int upper = countLetter(str, true);
        int lower = countLetter(str, false);
        //int upper = counterUpper(str);
        //int lower = counterLower(str);
        System.out.println("letters with uppercase " + upper + " letters with lowercase " + lower);
    }
}
