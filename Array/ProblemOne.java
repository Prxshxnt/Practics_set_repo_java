package Array;

import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int number[] = new int[size];
        
        for (int i = 0; i <size; i++) {
            System.out.println("Enter the element " +i + ": ");
            number[i]=sc.nextInt();
        }

        System.out.println("Enter the element for search: ");
        int x = sc.nextInt();
        for (int i = 0; i < number.length; i++) {
            if (number[i]==x) {
                System.out.println("x is found on index: " + i);
            }
        }
    }
}
