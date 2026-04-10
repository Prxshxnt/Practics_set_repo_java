package Array.practiceSet;

import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];


        System.out.print("Enter the value of key: ");
        int key = sc.nextInt();

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        boolean found= false;

        for (int i = 0; i < size; i++) {
            if (arr[i]==key) {
                System.out.println("Key element found at index: "+ i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
}
