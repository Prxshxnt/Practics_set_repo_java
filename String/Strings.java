 package String;

public class Strings {
    public static void main(String[] args) {
        String name = "Tony";
        String lastName = "Tony";
        // String fullName = name +" "+lastName;
        // System.out.println(fullName);

        // System.out.println(fullName.length());

        // for (int i = 0; i < fullName.length(); i++) {
        //     System.out.print(fullName.charAt(i));
        // }
        if (name.compareTo(lastName)==0) {
            System.out.println("Strings are equal.");
        }else{
            System.out.println("Not equal.");
        }

        // String sentence = "My name is Tony Stark";

        // String sub = sentence.substring(0,sentence.length() );
        // System.out.println(sub);

        String str ="1232";
        int number = Integer.parseInt(str);
        System.out.println("ParseInt "+ number);

        int num = 123;
        String strr = Integer.toString(num);
        System.out.println("toStr " + strr.length());

    }
    
}