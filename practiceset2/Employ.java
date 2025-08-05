//Constructor
class Employee {
    String name;
    int age;

    Employee(String n, int a) {
        name = n;
        age = a;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
    }
}
public class Employ {
    public static void main(String[] args) {
        Employee ob = new Employee("Alice", 34);

        ob.displayInfo();

        }
    }

