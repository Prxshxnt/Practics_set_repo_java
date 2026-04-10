package PracticeQuestion;

import java.util.Scanner;

public class GreaterNo {
    public static int greaterNo(int a , int b) {
        if (a>b) {
            return a;
        }else{
            return b;
        }
        }
            // return (a > b) ? a : b;
    // }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the value of a: ");
            int a = sc.nextInt();

            System.out.print("Enter the value of b: ");
            int b = sc.nextInt();

            int result = greaterNo(a, b);
            System.out.println("Greater number is "+ result);
            
        }
    }
    

