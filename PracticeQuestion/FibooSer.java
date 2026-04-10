package PracticeQuestion;

import java.util.Scanner;

public class FibooSer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int a =0 , b = 1;

        for (int i = 1; i <=n; i++) {
            System.out.print(a +" ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
}
