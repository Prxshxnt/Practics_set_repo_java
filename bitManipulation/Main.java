package bitManipulation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        int position1 = 2;
        int bit = 5;

        if (operation==1) {
         int bitManipulate = 1<<position1;
         int newNo = bitManipulate | bit;
         System.out.println(newNo);   
        }else{
            int bitManipulate = 1<<position1;
            int newBit = ~bitManipulate;
            int newNum = newBit & bit;
            System.out.println(newNum);
        }

        // Get bit
        // if ((bitManipulate & bit)==0) {
        //     System.out.println("bit was zero: ");
        // }else{
        //     System.out.println("Bit was one : ");
        // }

        // // Set bit
        // int newBit = bitManipulate | bit;
        // System.out.println(newBit);

        // ClearBit
        // int operationOne = ~bitManipulate;

        // int operationTwo = operationOne & bit;
        // System.out.println(operationTwo);

        // updatebit

    }
}