package PracticeQuestion;

import java.util.Scanner;

public class SumOfOdd {
    public static void calSumOfOdd(int num){
        int sum = 0;
            for (int i = 1; i <=num ; i+=2) {
                sum = sum + i;
            } System.out.println(sum);
            return;      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        calSumOfOdd(n);
    }
}
