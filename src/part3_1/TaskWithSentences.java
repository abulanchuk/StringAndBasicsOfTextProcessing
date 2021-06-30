package part3_1;

import java.util.Scanner;

public class TaskWithSentences {
    public static String sortParagraphs(String line) {
        String res = "";
        int count = 0;
        String[] myArray = line.split("\n");
        int[] dots = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length(); j++) {
                if (myArray[i].charAt(j) == '.' || myArray[i].charAt(j) == '!' || myArray[i].charAt(j) == '?') {
                    count++;
                    dots[i] = count;
                }
            }
            count = 0;
        }
        for (int i = 0; i < dots.length - 1; i++) {
            for (int j = dots.length - 1; j > i; j--) {
                if (dots[j - 1] > dots[j]) {
                    int tmp = dots[j - 1];
                    dots[j - 1] = dots[j];
                    dots[j] = tmp;

                    String tmp2 = myArray[j - 1];
                    myArray[j - 1] = myArray[j];
                    myArray[j] = tmp2;
                }
            }
        }
        res = String.join("\n", myArray);
        return res;
    }

    public static String sortSentencesByWordLength(String text) {
        String[] sentences = text.replaceAll("\n", " ").split("\\.|\\?|!");

        StringBuilder sortedText = new StringBuilder();
        for (int k = 0; k < sentences.length; k++) {
            String sentence = sentences[k].trim();
            if (sentence.isEmpty()) {
                continue;
            }

            String[] words = sentence.split(" ");
            int[] wordLengths = new int[words.length];
            for (int i = 0; i < words.length; i++) {
                wordLengths[i] = words[i].length();
            }

            for (int i = 0; i < words.length - 1; i++) {
                for (int j = words.length - 1; j > i; j--) {
                    if (wordLengths[j - 1] > wordLengths[j]) {
                        int tmp = wordLengths[j - 1];
                        wordLengths[j - 1] = wordLengths[j];
                        wordLengths[j] = tmp;

                        String tmp2 = words[j - 1];
                        words[j - 1] = words[j];
                        words[j] = tmp2;
                    }
                }
            }

            String sortedSentence = String.join(" ", words);
            sortedText.append(sortedSentence);
            sortedText.append(".\n");
        }

        return sortedText.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res = "";
        System.out.println("write sentences and when u want to finish write END ");
        for (; ; ) {
            String line = in.nextLine();
            if (line.equals("END")) break;
            else res += line + "\n";
        }
        System.out.println("Ener the number:\n 1. Sort paragraphs by number of sentences\n " +
                "2. In each sentence, sort the lines by word length \n " +
                "3. Enter a character and sorting is performed in descending order relative to the occurrence of the specified character ");
        int yourChoose = in.nextInt();
        switch (yourChoose) {
            case 1: {
                String resultFromFirstCase = sortParagraphs(res);
                System.out.println(resultFromFirstCase);
                break;
            }
            case 2: {
                String resultFromSecondCase = sortSentencesByWordLength(res);
                System.out.println(resultFromSecondCase);
                break;
            }
        }

    }
}
