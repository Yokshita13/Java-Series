import java.util.Scanner; 

class Automorphic { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number:");
        int number = sc.nextInt(); 
        int sqr = number * number; 

        // Check whether the last digits of square match with the number itself
        if (isAutomorphic(sqr, number)) {
            System.out.println(number + " is an automorphic number"); 
        } else { 
            System.out.println(number + " is not an automorphic number"); 
        }
    }

    static boolean isAutomorphic(int square, int number) {
        while (number > 0) {
            if (square % 10 != number % 10)
                return false;
            square /= 10;
            number /= 10;
        }
        return true;
    }
}


