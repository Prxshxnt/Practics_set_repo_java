public class Str {
    public static void main(String[] args) {
        String s1="Hello";
//        String s2="Hello";
        String s2= new String("Hello");
        System.out.println(s1==s2); // Same addess of the string
        System.out.println(s1.equals(s2)); //Same value of the string
    }
}
