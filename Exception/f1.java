package Exception;

public class f1 {
    public static void main(String[] args) {
        int  a = 5; 
        int b = 0;
        try {
            int d = a/b;
            int arr[] = new int[4];
            System.out.println(arr[6]);
        } catch (ArithmeticException e) {
            System.out.println("not divisible");
        }
        catch(ArrayIndexOutOfBoundsException g){
            System.out.println("Arraryy");
        }
    }
    
}
