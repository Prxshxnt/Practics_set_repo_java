package Exception;

import java.util.ArrayList;

public class Sorting {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0,1);
        arr.add(1,2);
        arr.add(2,5);
        arr.add(3,4);
        // arr.remove(3);
        // System.out.println(arr.isEmpty());
        // Collections.sort(arr);
        // System.out.println(arr);
        for(int val : arr){
            System.out.println(val);
        }
System.out.println("__________________________________________________________________________________________________________");

        arr.forEach((Integer val)-> System.out.println(val));

    }
}