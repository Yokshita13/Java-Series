class Animal {

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}


class Cat extends Animal {

    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}


class Calculator {
 
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
  
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.sound(); 
        myCat.sound();  


        Calculator calc = new Calculator();
        System.out.println("Sum of 2 numbers: " + calc.add(5, 10));     
        System.out.println("Sum of 3 numbers: " + calc.add(5, 10, 15));   
    }
}
