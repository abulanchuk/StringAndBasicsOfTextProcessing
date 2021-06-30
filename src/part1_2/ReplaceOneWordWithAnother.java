package part1_2;

import java.util.Scanner;

public class ReplaceOneWordWithAnother {
    public static String replaceWord(String str) {
        String replStr1 = str.replace("word", "letter");
        return replStr1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String res = replaceWord(str);
        System.out.println(res);
    }
}
