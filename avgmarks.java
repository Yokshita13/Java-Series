import java.util.*;
class AverageMarks
{
    public static void main(String args[])
    {
        float marks[] = {45.7f,66.7f,78.7f};
        float sum = 0;
        for(Float number:marks)
        {
            sum = sum + number;
        }
        System.out.println("The value of average marks is: " + sum/marks.length);
    }
}
