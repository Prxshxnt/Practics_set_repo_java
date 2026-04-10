package Practics_set_repo_java.StarPattern;

public class butterfly {
    public static void main(String[] args) {
        int n=5;
        // upper half
        for(int i=1; i<=n; i++){
            // first part
            for(int j=1 ; j<=i ; j++){
                System.out.print(" * ");
            }
            // print space
                int space= 2*(n-i);
                for(int j=1; j<=space ; j++){
                    System.out.print("   ");
                }
                for(int j=1; j<=i ; j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
             for(int i=n; i>=1; i--){
            //side first part
            for(int j=1 ; j<=i ; j++){
                System.out.print(" * ");
            }
            // print space
                int space= 2*(n-i);
                for(int j=1; j<=space ; j++){
                    System.out.print("   ");
                }
                for(int j=1; j<=i ; j++){
                    System.out.print(" * ");
                }
                System.out.println();

        }
    }
    
}