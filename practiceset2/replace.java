package Practics_set_repo_java.practiceset2;

import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner rep=new Scanner(System.in);
        System.out.println("Enter your text here: ");
        String text=rep.nextLine();
        text=text.replace(" ", "_");
        System.out.println(text);

        //One another Example
        System.out.println("Here the one another example: ");
        String letter = "Dear <|name|>, thanks a lot.";
        letter = letter.replace("<|name|>", "Prashant");
        System.out.println(letter);
        
    }
    
}
