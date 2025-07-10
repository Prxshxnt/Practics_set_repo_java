package Practics_set_repo_java.practiceset2;
import java.util.Scanner;

public class sum_of_no{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b=sc.nextInt();
        System.out.println("Enter the value of c: ");
        int c=sc.nextInt();
        System.out.print("The sum of all number is: ");
        int sum=a+b+c;
        System.out.println(sum);
    }

}