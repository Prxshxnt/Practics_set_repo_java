import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
            // upperHalf

        for (int i = 1; i <=n; i++) {
            // star
            for (int j = 1; j <=i; j++) {
                System.out.print( " * ");
            }
            // space
            int space =2 * (n-i) ;
            for (int j = 1; j <=space; j++) {
                System.out.print("   ");
            }
            // star
             for (int j = 1; j <=i; j++) {
                System.out.print( " * ");
            }
            System.out.println();
        }
            // lowerHalf

            for (int i = n; i >=1; i--) {
            // star
            for (int j = 1; j <=i; j++) {
                System.out.print( " * ");
            }
            // space
            int space =2 * (n-i) ;
            for (int j = 1; j <=space; j++) {
                System.out.print("   ");
            }
            // star
             for (int j = 1; j <=i; j++) {
                System.out.print( " * ");
            }
            System.out.println();
        }
    }
}
