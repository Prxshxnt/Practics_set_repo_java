package Practics_set_repo_java.practiceset2;

import java.util.Scanner;

public class lowercase {
    public static void main(String[] args) {
        Scanner con=new Scanner(System.in);
        String name=con.nextLine();
        String lowstr=name.toLowerCase();
        System.out.println(lowstr);

        // this code for escape sequence char
        String letters= "Hello Dear ,\n\t This code is write by Prashant.\n \t Java is a programming language";
        System.out.println(letters);

        String lette= "Hello Dear ,\t This code is write by Prashant.\t Java is a programming language";
        System.out.println(lette);
    }
    
}
