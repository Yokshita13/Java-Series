import java.util.Scanner;
class PrimeNumbers
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[20];
        System.out.println("Enter 20 numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Prime Numbers:");
        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    c++;
                }  
            }
            if (c == 2)
                System.out.print(arr[i] + ", ");
        }
    }
}
