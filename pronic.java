import java.util.Scanner;

class Pronic {
    public static void main(String args[]) {
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            if (i * (i + 1) == num) {
                c = 1;
                break;
            }
        }

        if (c == 1) {
            System.out.println("It is a pronic number.");
        } else {
            System.out.println("It is not a pronic number.");
        }
    }
}
