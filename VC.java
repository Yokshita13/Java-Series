import java.util.Scanner;
class vowelConso
{
    public static void main(String args[])
    {
        String s;
        char ch;
        int i,l,v=0,c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        s = sc.next();
        s = s.toUpperCase();
        l = s.length();
        for(i=0;i<l;i++)
        {
            ch = s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                v++;
            }
            else
            {
                c++;
            }
            System.out.println("No. of vowels = "+v);
            System.out.println("No. of consonant = "+c);
        }
    }
}
