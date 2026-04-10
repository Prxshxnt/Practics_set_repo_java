package Sorting;

import java.util.Scanner;

public class insertionSort {
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: ");
        printArr(arr);

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i -1;
            while (j>=0 && arr[j]> current) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        System.out.println("Sorted array: ");
        printArr(arr);

    }
    
}