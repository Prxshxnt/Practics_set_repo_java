package Exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ListArr= new ArrayList<>();
        ListArr.add(1);
        ListArr.add(2);
        ListArr.add(3);
        ListArr.add(4);
        ListArr.add(5);

        Iterator<Integer> itr = ListArr.iterator();
        while (itr.hasNext()) {
            Integer num = itr.next();
            if (num==4) {
                itr.remove();
                System.out.println("Removing 4...");
            }
            
        }
        System.out.println(ListArr);
    }
    
}
