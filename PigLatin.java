public class PigLatin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = sc.next();
        int len = word.length();
        word=word.toUpperCase();
        String piglatin="";
        int flag=0;
        for(int i = 0; i < len; i++)
        {
            char ch = word.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                piglatin=word.substring(i) + word.substring(0,i) + "AY";
                flag=1;
                break;
            }
        }
        if(flag == 0)
        {
            piglatin = word + "AY";
        }
        System.out.println(word + " in Piglatin format is " + piglatin);
    }
}
