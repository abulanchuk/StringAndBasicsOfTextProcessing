package part2_5;

import java.util.Scanner;

public class HowManyAInTheWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        System.out.println(word.length() - word.replaceAll("a", "").length());
    }
}
