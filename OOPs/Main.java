 package OOPs;

class Main {

    public static void main(String[] args) {
        dog makesound=new dog();
        makesound.sound();

        cat makesound1=new cat();
        makesound1.sound();

        Student stud=new Student();
        stud.setName("prashant");
        System.out.println("Student Name: " + stud.getName());
    }
}