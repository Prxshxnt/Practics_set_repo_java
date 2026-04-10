// Comparator

package ComparebleVsComparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String [] arr = {"Banana" , "Orange" , "Apple"};
        

        Arrays.sort(arr, (val1, val2) -> val1.length()- (val2.length()));
System.out.println(Arrays.toString(arr));

        // Arrays.sort(arr, (val1, val2) -> val2.compareTo(val1));
        // for(String v :arr){
        //     System.out.println(v);
        
        }

        
        // Comparable

        // Integer [] arrr = {1,3,4,2,7};
        // Arrays.sort(arrr);
        // for (Integer integer : arrr) {
        //     System.out.println(integer);
        // }
    // ;
    }
    

