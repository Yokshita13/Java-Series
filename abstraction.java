
abstract class Animal {

    public abstract void sound();


    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}


class Dog extends Animal {
 
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {

        Animal myDog = new Dog();

        myDog.sound();

        myDog.sleep();
    }
}
