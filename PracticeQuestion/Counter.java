 package PracticeQuestion;

import java.util.Scanner;

public class Counter {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int positiveCounter =0;
    int negativeCounter =0;
    int Zero =0;
    int yourChoise;

    do{
        System.out.print("Enter th number: ");
        int num = sc.nextInt();

        if (num>0) {
            positiveCounter++;
        }else if (num<0) {
            negativeCounter++;
        }else{
            Zero++;
        }
        System.out.println("Do you want to continue? (1 = Yes, 0 = No): ");
        yourChoise = sc.nextInt();
    }while(yourChoise==1);

    System.out.println("PostitiveCounter: " + positiveCounter);
    System.out.println("NegativeCounter: " + negativeCounter);
    System.out.println("Zero: " + Zero);
    
}
    
}