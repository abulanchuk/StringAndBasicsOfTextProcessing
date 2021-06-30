package part1_3;

import java.util.Scanner;

public class CountDigitsInLine {
    public static int countDigits(String line) {
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i)))
                counter++;

        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int res = countDigits(str);
        System.out.println(res);
    }
}
