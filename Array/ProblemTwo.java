// Take an array of names as input from the user and print them on the screen.

package Array;

import java.util.Scanner;

public class ProblemTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        String name[] = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the names: ");
            name[i] = sc.next();
        }
        for (int i = 0; i < name.length; i++) {
            // System.out.println("Hello "+ name[i]);

                       System.out.println("name " + (i+1) +" is : " + name[i]);

        }
            
        }


    }
    

