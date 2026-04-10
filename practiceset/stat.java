//Static variable
class Student{
    String name;
    static int fee=1200;
    static String School="J.B Public School";
    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("School: " + School);
        System.out.println("fee: " + fee);
    }
}
public class stat{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Alice";

        Student s2=new Student();
        s2.name="Bob";


        Student s3=new Student();
        s3.name="charlie";

        Student.fee=1400;
        Student.School="AB Inter College";

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

    }
}
