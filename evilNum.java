import java.io.*;
import java.util.*;
class Evil_number
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a positive number");
        n = sc.nextInt();
        if(n<0)
        {
            System.out.println("Invalid input");
            return;
        }
        int count = 0;
        int p = 0;
        int binNum = 0;
        while (n > 0) {
            int d = n % 2;
            if (d == 1)
                count++;
            binNum += (int)(d * Math.pow(10, p));
            p++;
            n /= 2;
        }
        
        System.out.println("Binary Equivalent: " + binNum);
        System.out.println("No. of 1's: " + count);
        
        if (count % 2 == 0)
            System.out.println("Output: Evil Number");
        else
            System.out.println("Output: Not an Evil Number");
    }
}
