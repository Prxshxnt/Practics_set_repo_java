//method parameter
class a{
    public int sum(int a, int b){
        return a+b;
    }
}
public class parameter {
    public static void main(String[] args) {
        a obj=new a();
        int result=obj.sum(5,6);
        System.out.println("The sum of the number is: " + result);
    }
}
