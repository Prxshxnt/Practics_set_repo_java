package  PracticeQuestion;

import java.util.Scanner;

public class PowerValue {
    public static double CalValue(double x , double n){
        double value = Math.pow(x, n);
        return value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x =sc.nextInt();

        System.out.print("Enter the value of n: ");
        int n =sc.nextInt();

        double result = CalValue(x, n);
        System.out.print("Result: " + result);
    }
}