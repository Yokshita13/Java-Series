class Programmer {
    String name;
    int id;
    String language;

    // Constructor
    public Programmer(String name, int id, String language) {
        this.name = name;
        this.id = id;
        this.language = language;
    }

    // Display Programmer Info
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Language: " + language);
    }
}


public class Main {
    public static void main(String[] args) {
        // Create Programmer objects
        Programmer p1 = new Programmer("Yokshita", 101, "Java");

        // Display their information
        System.out.println("Programmers working at Microsoft:");
        p1.displayInfo();
    }
}
