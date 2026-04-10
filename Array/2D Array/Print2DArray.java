

import java.util.Scanner;


public class Print2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of rows: ");
        int rows =sc.nextInt();

        System.out.print("Enter the no of columns: ");
        int columns =sc.nextInt();

        int [][] number = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
            System.out.print("Enter the elements of rows and columns " + i +","+j +": " );
            number[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(number[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
