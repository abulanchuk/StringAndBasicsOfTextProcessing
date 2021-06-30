package part2_4;

public class CopyLetters {
    public static String makeNewWord(String str1){
        String str2= str1.substring(7,8)+str1.substring(3,5)+str1.substring(7,8);
        return str2;
    }
    public static void main(String[] args) {
        String str1 = "информатика";
        String str2 = makeNewWord(str1);
        System.out.println(str2);
    }
}
