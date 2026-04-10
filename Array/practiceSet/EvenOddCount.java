package Array.practiceSet;

import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int arr[] = new int[size];

        int even = 0;
        int odd = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (arr[i]%2==0) {
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even numbers = " + even);
        System.out.println("odd numbers = " + odd);
    }
}
