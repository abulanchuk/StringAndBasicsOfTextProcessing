package part1_4;

import java.util.Scanner;

public class CountNumbersInLine {
    public static int counterOfNumbers(String str){
        int counter = 0;
        for (int i = 1; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)) && Character.isDigit(str.charAt(i-1)))
                counter++;
        }
        if(Character.isDigit(str.charAt(str.length()-1))){
            counter++;
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int res = counterOfNumbers(str);
        System.out.println(res);
    }
}
