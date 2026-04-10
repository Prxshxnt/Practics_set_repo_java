package Array;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int number[] = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value of " + i + ": ");
            number[i] = sc.nextInt();
            
        }
        for (int i = 0; i < size; i++) {
            System.out.print(number[i] +", ");
        }
    }
}
