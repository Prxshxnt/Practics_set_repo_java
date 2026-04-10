

import java.util.Scanner;

public class checker {
    
    public static void main(String[] args) {
        Scanner chk=new Scanner(System.in);
        System.out.println("Enter the number: ");
        if(chk.hasNextInt()){
         int number =chk.nextInt();
         System.out.println("Given number is Integer");    
        }
        else
        {
            System.out.println("Given number is not Integer:");
        }
    }
}
