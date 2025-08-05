package Practics_set_repo_java.practiceset2;

import java.util.Scanner;

public class km_to_miles {
    public static void main(String[] args) {
        System.out.println("Kilometer into Miles conversion ");
        Scanner con=new Scanner(System.in);
        System.out.println("Enter the distance in kilometer: ");
        int km=con.nextInt();
        double miles=0.621371d;
        double distance=(km*miles);
        System.out.println(distance + " miles " + " in " + km + " km " + ".");
    }
    
}
