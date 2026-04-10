import java.util.Scanner;

public class findX {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of rows: ");
        int rows =sc.nextInt();

        System.out.print("Enter the no of columns: ");
        int columns =sc.nextInt();

        System.out.print("Enter the finding element: ");
        int x = sc.nextInt();

        int [][] number = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
            System.out.print("Enter the elements of rows and columns " + i +","+j +": " );
            number[i][j]=sc.nextInt();
          
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (number[i][j]==x) {
                System.out.println("X is found at: (" + i + "," + j +")");
            }

            }
        }
    }
}

