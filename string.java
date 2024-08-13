import java.util.*;

public class StringVowelReplaceStar {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a word: ");
        String s = sc.nextLine();
        
        StringBuilder modifiedString = new StringBuilder(s);

        for (int i = 0; i < modifiedString.length(); i++) {
            char c = modifiedString.charAt(i);
            if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u') {
                modifiedString.setCharAt(i, '#');
            }
        }
        
        System.out.println("Original String: " + s);
        System.out.println("Modified String: " + modifiedString.toString());
    }
}

