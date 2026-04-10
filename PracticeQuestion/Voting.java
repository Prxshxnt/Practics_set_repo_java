package PracticeQuestion;

import java.util.Scanner;

public class Voting {
    public static int ageChecker(int age){
        if (age>=18) {
            System.out.println("You are eligible for vote");
            return age;
        }else{
            System.out.println("You are not eligible for vote");
            return age ;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        int result = ageChecker(age);
        System.out.println(result);
        
    }
}
