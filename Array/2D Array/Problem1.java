import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the no of columns: ");
        int columns = sc.nextInt();

        int matrix[][] = new int[rows][columns];

        // input matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Spiral Order Matrix is:");

        int rowstart = 0;
        int rowend = rows - 1;
        int columnstart = 0;
        int columnend = columns - 1;

        while (rowstart <= rowend && columnstart <= columnend) {

            // 1️⃣ top row
            for (int col = columnstart; col <= columnend; col++) {
                System.out.print(matrix[rowstart][col] + " ");
            }
            rowstart++;

            // 2️⃣ right column
            for (int row = rowstart; row <= rowend; row++) {
                System.out.print(matrix[row][columnend] + " ");
            }
            columnend--;

            // 3️⃣ bottom row
            for (int col = columnend; col >= columnstart; col--) {
                System.out.print(matrix[rowend][col] + " ");
            }
            rowend--;

            // 4️⃣ left column
            for (int row = rowend; row >= rowstart; row--) {
                System.out.print(matrix[row][columnstart] + " ");
            }
            columnstart++;
        }
    }
}