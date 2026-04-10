package Array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int number[] = new int[size];
try{
        for(int i = 1 ; i<=size; i++){
            System.out.println(number[i]);
        }
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Correct");
    }

        // int [] marks = new int[3];
        // marks[0]=78;
        // marks[1]=75;
        // marks[2]=74;

        // for (int i = 0; i <3; i++) {
        //     System.out.println(marks[i] + "%");
        // }
    }
}
