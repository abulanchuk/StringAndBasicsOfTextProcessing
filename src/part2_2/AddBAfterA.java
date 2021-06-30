package part2_2;

import java.util.Scanner;

public class AddBAfterA {
    public static StringBuilder addLetterB(StringBuilder strBuilder) {
        int where = -1;
        int start = 0;
        StringBuilder strRes = new StringBuilder(strBuilder);

        for (int i = start; i < strBuilder.length(); i++) {
            where = strBuilder.indexOf("a", where + 1);
            if (where == -1) {
                break;
            }
            strRes = strBuilder.insert(where + 1, "b");
        }
        return strRes;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuilder strBuilder = new StringBuilder(str);
        StringBuilder res = addLetterB(strBuilder);
        System.out.println(res);

    }
}
