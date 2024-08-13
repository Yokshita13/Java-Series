import java.util.Scanner;
class Composite
{
        int n;
        //function to take input
        void accept()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            n = sc.nextInt();
        }
        //function to check for composite number
        void composite()
        {
            int c = 0,i;
            //counting the number of factor
            for(i=1;i<=n;i++)
            {
                if(n%i==0)
                   c++;
            }
            if(c>2)
            System.out.println("The number is composite");
            else
            System.out.println("The number is not composite");
        }
        //main function 
        public static void main(String[]args)
        {
            //creating an oject
            Composite c = new Composite();
            //calling the function
            c.accept();
            c.composite();
        }
    }
