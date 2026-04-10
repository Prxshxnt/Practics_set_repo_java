package PracticeQuestion;

import java.util.Scanner;

public class Average {
    public static void avgOfNo(int a, int b, int c){
        double AVG = ((a + b + c)/3);

        System.out.println(AVG);
        return ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of a: ");
        int b = sc.nextInt();

        System.out.print("Enter the value of a: ");
        int c = sc.nextInt();

        avgOfNo(a, b, c);
    }
}
