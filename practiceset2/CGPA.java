package Practics_set_repo_java.practiceset2;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner CGPA=new Scanner(System.in);
        System.out.println("Enter the of DBMS: ");
        int DBMS=CGPA.nextInt();
        System.out.println("Enter the marks of DAA: ");
        int DAA=CGPA.nextInt();
        System.out.println("Enter the marks of Big Data: ");
        int Big_Data=CGPA.nextInt();
        float result= ((DBMS+DAA+Big_Data))/30f;
        System.out.println("The CGPA is: " +result);
        
    }
    
}
