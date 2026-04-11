package Sorting;

public class allTech {

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int original[] = {5,2,3,1,4};

        // ---------------- BUBBLE SORT ----------------
        int arr1[] = original.clone();
        System.out.println("Bubble Sort:");
        printArr(arr1);

        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - i - 1; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        printArr(arr1);

        // ---------------- SELECTION SORT ----------------
        int arr2[] = original.clone();
        System.out.println("\nSelection Sort:");
        printArr(arr2);

        for (int i = 0; i < arr2.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[smallest] > arr2[j]) {
                    smallest = j;
                }
            }
            int temp = arr2[smallest];
            arr2[smallest] = arr2[i];
            arr2[i] = temp;
        }
        printArr(arr2);

        // ---------------- INSERTION SORT ----------------
        int arr3[] = original.clone();
        System.out.println("\nInsertion Sort:");
        printArr(arr3);

        for (int i = 1; i < arr3.length; i++) {
            int current = arr3[i];  // ✅ FIXED
            int j = i - 1;

            while (j >= 0 && arr3[j] > current) {
                arr3[j + 1] = arr3[j];
                j--;
            }
            arr3[j + 1] = current;
        }
        printArr(arr3);
    }
}