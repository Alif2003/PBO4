class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void displayInfo(String address) {
        displayInfo();
        System.out.println("Address: " + address);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 30);
        Person person2 = new Person("Jane Doe", 25);

        person1.displayInfo();
        person2.displayInfo("123 Main Street, City");
    }
}
