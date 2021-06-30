package part2_6;

import java.util.Scanner;

public class NewWordWithDoubleLetters {
    public static String addSecondLetter(String str1) {
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            str2.append(str1.charAt(i));
            str2.append(str1.charAt(i));
        }
        return str2.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String res= addSecondLetter(str);
        System.out.println(res);
    }
}
