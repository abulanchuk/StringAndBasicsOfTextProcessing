package part1_5;

import java.util.Scanner;

public class DeleteSpaces {
    public static String delSpacesAtTheBeginningAndEnd(String str) {
        String res = "";
        for (String retVal : str.split(" ")) {
            // retVal = retVal.trim();
            if (retVal.isEmpty()) {
                continue;
            }
            res += retVal + " ";
        }

        return res.trim();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String withoutSpacesAtTheBeggingAndEnd = delSpacesAtTheBeginningAndEnd(str);

        System.out.println(withoutSpacesAtTheBeggingAndEnd);
    }
}
