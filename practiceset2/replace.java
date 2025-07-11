package Practics_set_repo_java.practiceset2;

import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner rep=new Scanner(System.in);
        String text=rep.nextLine();
        text=text.replace(" ", "_");
        System.out.println(text);
        
    }
    
}
