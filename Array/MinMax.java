package Array;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int number[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the number: ");
            number[i] = sc.nextInt();
        }

        // Correct initialization
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }

            if (number[i] > max) {
                max = number[i];
            }
        }

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}