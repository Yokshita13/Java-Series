
import java.util.Scanner;

class ArmstrongNum {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        int orgNum = num;
        int cubeSum = 0;
        int itr = 1;
        while (num > 0) {
            int digit = num % 10;
            cubeSum = cubeSum + (digit * digit * digit);
            num /= 10;
            System.out.println("Iteration " + itr++);
            System.out.println("digit=" + digit);
            System.out.println("cubeSum=" + cubeSum);
            System.out.println();
        }
        if (cubeSum == orgNum)
            System.out.println(orgNum + " is an Armstrong number");
        else
            System.out.println(orgNum + " is not an Armstrong number");
    }
}
