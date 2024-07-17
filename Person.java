public class Person {
    private String name;
    private int age;
    private String address;

    // Constructor to initialize the fields
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display person's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    // Method to call displayDetails
    public void myDetails() {
        displayDetails();
    }

    // Method to print the current instance
    public void printCurrentInstance() {
        System.out.println("Person details:");
        displayDetails();
    }

    public static void main(String[] args) {
        // Create an object named John
        Person john = new Person("John", 19, "00100 Nairobi");

        // Call the printCurrentInstance method
        john.printCurrentInstance();
    }
}
