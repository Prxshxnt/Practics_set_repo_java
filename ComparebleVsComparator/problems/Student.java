package ComparebleVsComparator.problems;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    String name;
    int RollNo;
    
    Student(int RollNo, String name ){
        this.name=name;
        this.RollNo=RollNo;
    }
    public int compareTo(Student s){
        return 0;
    }
    public String toString(){
        return RollNo + " " + name;
    }
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(3, "Rahul"));
        list.add(new Student(1, "Amit"));
        list.add(new Student(2, "Neha"));

        // Collections.sort(list);

        Collections.sort(list,(v1 , v2) -> v1.name.compareTo(v2.name));

        // Collections.sort(list,(v1 , v2)-> v2.RollNo - v1.RollNo);

        System.out.println(list);
        
    }
}
