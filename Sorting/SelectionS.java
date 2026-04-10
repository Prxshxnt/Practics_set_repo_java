package Sorting;

import java.util.Scanner;

public class SelectionS {
    public static void printArr(int arr[]){
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i <n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Original array: ");
        printArr(arr);

        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }

            } 
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
        }
        System.out.println("Sorted Array:"); 
        printArr(arr);
    }
}
