import java.util.*;

class CheckValueInArray {
    public static void main(String args[]) {
        float marks[] = {45.7f, 67.8f, 63.4f};
        float num = 45.75f;
        boolean isInArray = false;
        
        for(float number : marks) {
            if(num == number) {
                isInArray = true;
                break; // No need to check further once the number is found
            }
        }
        
        if(isInArray) {
            System.out.println("The value is present in the array");
        } else {
            System.out.println("The value is not present in the array");
        }
    }
}

