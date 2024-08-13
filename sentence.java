import java.util.Scanner;

public class sentence {

    public static void main(String args[])

    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence");

        String word = sc.nextLine();

        int len = word.length();

        for (int i = 0; i < len; i++)

        {

            char ch = word.charAt(i);

            System.out.println("ASCII of" + ch + "=" + (int) ch);

        }

    }

}
