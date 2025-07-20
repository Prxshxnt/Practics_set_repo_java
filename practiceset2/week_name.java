package Practics_set_repo_java.practiceset2;

import java.util.Scanner;

class  week_name{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of day: ");
        int day=sc.nextInt();
        String dayString;
        switch (day) {
            case 1:
                dayString="Monday";
                break;
            case 2:
                dayString="Tuesday";
                break;
            case 3:
                dayString="Wednesday";
                break;
            case 4:
                dayString="Thursday";
                break;
            case 5:
                dayString="Friday";
                break;
            case 6:
                dayString="Saturday";
                break;
            case 7:
                dayString="Sunday";
                break;
        
            default:
                dayString="Invaid day";
                break;   
        }
        System.out.println(dayString);

    }
}