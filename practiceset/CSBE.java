package Practics_set_repo_java.practiceset2;

import java.util.Scanner;

public class CSBE {
    public static void main(String[] args) {
        Scanner marks=new Scanner(System.in);
        System.out.println("Please enter the English marks obtained.");
        int English=marks.nextInt();
        System.out.println("Please enter the Hindi marks obtained.");
        int Hindi=marks.nextInt();
        System.out.println("Please enter the Maths marks obtained.");
        int Maths=marks.nextInt();
        System.out.println("Please enter the Physics marks obtained.");
        int Physics=marks.nextInt();
        System.out.println("Please enter the Chemistry marks obtained.");
        int Chemistry=marks.nextInt();
        int total=English+Hindi+Maths+Physics+Chemistry;
        System.out.println("The total obtained marks is " + total);
        float result= total /5f;
        System.out.println("You got " + result +"%"  + " marks");
    }
    
}