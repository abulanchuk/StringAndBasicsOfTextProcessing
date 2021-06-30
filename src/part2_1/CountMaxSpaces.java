package part2_1;

import java.util.Scanner;

public class CountMaxSpaces {
    public static int findMax(String a) {
        int n = 0;
        int max = 0;
        char[] result = a.toCharArray();
        for (int i = 0; i < a.length() - 1; i++) {
            n = 0;
            if (result[i] == ' ') {
                n = 1;

                while (result[++i] == ' ') {
                    n++;
                }
                max = (n < max) ? max : n;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int res = findMax(str);
        System.out.println(res);
    }
}
