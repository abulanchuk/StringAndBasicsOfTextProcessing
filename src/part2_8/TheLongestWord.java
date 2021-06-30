package part2_8;

import java.util.Scanner;

public class TheLongestWord {
    public static String counterLetters(String line) {
        String[] words = line.split(" ");
        String max = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max.length() && words[i].length() != max.length()) {
                max = words[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String res = counterLetters(line);
        System.out.println(res);
    }
}
