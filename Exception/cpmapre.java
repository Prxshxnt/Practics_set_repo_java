package Exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class cpmapre {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>() {
            {
             this.add("A");
            }
            {
             this.add("B");
            }
{
             this.add("D");
            }
            {
             this.add("C");
            }
        };
        System.out.println(        Collections.max(list)
);
    }
}
