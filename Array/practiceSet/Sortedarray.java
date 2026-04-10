package Array.practiceSet;

import java.util.Scanner;

public class Sortedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int [] arr = new int[size];
        boolean sorted = true;
        for (int i = 0; i <size; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < size-1; i++) {
            if (arr[i]>arr[i+1]) {
                sorted=false;
                break;
            }
        }
        if (sorted) {
            System.out.println("Array is sorted.");
        }else{
            System.out.println("Array is not sorted.");
        }
    }
}
