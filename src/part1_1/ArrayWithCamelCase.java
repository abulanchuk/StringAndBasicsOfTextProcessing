package part1_1;

import java.util.Scanner;

public class ArrayWithCamelCase {
    public static String toSnakeCase(String[] array) {
        String str = "";
        String camelStr = "";
        for (int i = 0; i < array.length; i++) {
            camelStr = camelStr + array[i];
            str = camelStr.replaceAll("([A-Z]+)([A-Z][a-z])", "$1_$2").replaceAll("([a-z])([A-Z])", "$1_$2");
            ;
        }
        return str.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String[] myArray = new String[size];
        for (int i = 0; i < size; i++) {
            myArray[i] = in.next();
        }
        String res = ArrayWithCamelCase.toSnakeCase(myArray);
        System.out.println(res);

    }
}
