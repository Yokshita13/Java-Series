import java.util.Scanner;
class Marks
{
    public static void main(String[]args)
    {
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Physics: ");
        float a = sc.nextFloat();
        System.out.println("Enter a Chemistry: ");
        float b = sc.nextFloat();
        System.out.println("Enter your Mathematics: ");
        float c = sc.nextFloat();
        System.out.println("Enter your Computer: ");
        float d = sc.nextFloat();
        System.out.println("Enter your English: ");
        float e = sc.nextFloat();
        float total = (a+b+c+d+e);
        System.out.println("Here's is your marks"+total);
        float percentage = (total/500)*100;
        System.out.println("percentage");
        System.out.println("Thanks for visiting");
    }
}
