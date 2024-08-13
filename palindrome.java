import java.util.Scanner;
class Palindrome
{
    public static void main(String [] args)
    {
        String s,s1 = " ";
        char ch = ' ';
        int i,l;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        s = sc.next();
        l = s.length();
        for(i = l-1;i>=0;i=0)
        {
            ch = s.charAt(i);
            s1 = s1 + ch;
        }
        if(s1.equalsIgnoreCase(s))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}
