package Function;

import java.util.Scanner;

public class Factorial {
    public static void factorical(int n){
        if (n<0) {
            System.out.println("Invalid no!");
            return;
        }
        int fact=1;
        for (int i = n; i >=1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        factorical(n);
        return;
    }
}
