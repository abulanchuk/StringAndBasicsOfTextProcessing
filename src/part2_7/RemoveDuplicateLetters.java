package part2_7;

import java.util.Scanner;

public class RemoveDuplicateLetters {
    public static String deleteDuplicateLetters(String str1) {
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.indexOf(str1.charAt(i)) == i && str1.charAt(i) != ' ') {
                str2.append(str1.charAt(i));
            }
        }
        return str2.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String res = deleteDuplicateLetters(str);
        System.out.println(res);
    }
}
