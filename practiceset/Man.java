interface Person{
    public String profession();
}

class teacher implements Person{
    @Override
    public String profession(){
        return "teacher";
    }
}
class Engineer implements Person{
    @Override
    public String profession(){
        return "Engineer";
    }
}
public class Man{
    public static void main(String[] args) {
        teacher obj=new teacher();
        obj.profession();
        Engineer obj2=new Engineer();
        obj2.profession();
        System.out.println(obj2.profession());
        System.out.println(obj.profession());
    }
}