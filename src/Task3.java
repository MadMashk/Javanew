import java.util.*;
public class Task3 {
    static void run(){
        int words;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Input text");
        String text=scanner.nextLine();
        words=wordsCount(text);
        System.out.println("Count of words - "+words);
    }
    static int wordsCount(String a){
        int count=0;
        for(int i=0;i<a.length();i++){
        if(a.charAt(i)==' ')
            count++;
        }
        return count+1;
    }
    static String sort(String a) {
        String result="";
        String[] words=a.split(" ");
        Arrays.sort(words);
        for(int i=0;i<words.length;i++){
            result=words[i]+" "+result;
        }
        return result;
    }

    static String capital(String a){
        StringBuilder builder = new StringBuilder(a);
        if (Character.isAlphabetic(a.codePointAt(0)))
            builder.setCharAt(0, Character.toUpperCase(a.charAt(0)));
        for (int i = 1; i < a.length(); i++)
            if (Character.isAlphabetic(a.charAt(i)) && Character.isSpaceChar(a.charAt(i - 1)))
                builder.setCharAt(i, Character.toUpperCase(a.charAt(i)));
    return builder.toString();
    }
}