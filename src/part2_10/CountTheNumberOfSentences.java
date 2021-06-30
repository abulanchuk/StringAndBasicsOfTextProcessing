package part2_10;

import java.util.Scanner;

public class CountTheNumberOfSentences {
    public static int counter(String text) {
        int count = 0;
        char[] myArray = text.toCharArray();
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == '.' || myArray[i] == '!' || myArray[i] == '?') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        int res = counter(x);
        System.out.println(res);
    }
}
