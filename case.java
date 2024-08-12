public class case {
    Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = in.nextLine();
        int len = str.length();
        StringBuffer sbLowerCase = new StringBuffer();
        StringBuffer sbUpperCase = new StringBuffer();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch))
                sbLowerCase.append(ch);
            else if (Character.isUpperCase(ch))
                sbUpperCase.append(ch);
        }
        System.out.println("Input String:");
        System.out.println(str);
        String newStr = sbLowerCase.append(sbUpperCase).toString();
        System.out.println("Changed String:");
        System.out.print(newStr);
}
