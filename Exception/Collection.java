package Exception;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        Object[] arr = arrList.toArray();


        System.out.println("total no of element: "+ arrList.size());
        System.out.println("Check collection is empty : " + arrList.isEmpty());
        System.out.println("Element 3 is present in collection: "+ arrList.contains(3));
        System.out.println("Convert into array: " + Arrays.toString(arr));

        List<Integer> arrList2 = new ArrayList<>();
            arrList2.add(4);
            arrList2.add(5);
            arrList2.add(6);

            arrList.addAll(arrList2);
        System.out.println("add list 2 in list 1: " + arrList);

        System.out.println("Remove element: " + arrList.remove(3) + "X :+" + arrList);

        // arrList.clear();
        //     System.out.println("Empty: "+arrList);

        System.out.println("collection 1 and collerction 2 are equal: "+ arrList.equals(arrList2));
        arrList.add(4);
        arrList.stream().filter(n -> n>0)  .forEach(System.out::println);
        System.out.println("Stream: " + arrList);
        
        Iterator<Integer> itr = arrList.iterator();
        while (itr.hasNext()) {
            Integer num = itr.next();
            if (num ==4) {
                itr.remove();
            }
        }

            System.out.println("Iterator: "+ arrList);


    }
    
}
