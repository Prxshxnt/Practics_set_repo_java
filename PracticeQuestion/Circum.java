package PracticeQuestion;

import java.util.Scanner;

public class Circum {
    public static double calCrcmtnc(double radius){
        double C = 2 * Math.PI * radius;
        return C;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double result = calCrcmtnc(radius);
        System.out.println("Circumference = " + result);
    }
}
