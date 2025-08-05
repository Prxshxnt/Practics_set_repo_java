package Practics_set_repo_java.practiceset2;

import java.util.Scanner;

public class grammer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Parts of Speech.");
        String Eng=sc.nextLine();
        String EnglishString;
        switch (Eng)
        {
            case "1" , "Noun":
            EnglishString="A noun is a word that names a person, place, thing, or idea.\n" + //
                                "Examples: Ram, school, book, honesty.\n" + //
                                "Sentence: The book is on the table.";   
            break;

            case "2" ,"Pronoun":
            EnglishString="A pronoun is a word used instead of a noun to avoid repetition.\n" + //
                                "Examples: he, she, it, they, we.\n" + //
                                "Sentence: Riya is my friend. She is kind.\n" + //
                                "\n";
            break;
            
            case "3", "Adjective":
            EnglishString="An adjective is a word that describes a noun or pronoun.\n" + //
                                "Examples: beautiful, tall, smart, red.\n" + //
                                "Sentence: It is a beautiful flower.\n" + //
                                "\n";   
            break;

            case "4","Verb":
            EnglishString="A verb is a word that shows an action, state, or occurrence.\n" + //
                                "Examples: run, eat, is, play, write.\n" + //
                                "Sentence: They play cricket.\n" + //
                                "\n";
               
            break;
            case "5","Adverb":
            EnglishString=  "An adverb is a word that modifies (describes) a verb, adjective, or another adverb, often showing how, when, where, or to what extent.\n" + //
                                "Examples: quickly, very, tomorrow, here.\n" + //
                                "Sentence: She runs quickly.\n" + //
                                "\n";
            break;
        
            default:
            EnglishString="invalid str";
            break;
       
        } System.out.println(EnglishString);
    }
    
}