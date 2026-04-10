package Queue;

import java.util.PriorityQueue;

public class PQm {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxpq= new PriorityQueue<>((Integer a , Integer b)-> b- a);
        maxpq.add(3);
        maxpq.add(5);
        maxpq.add(2);
        maxpq.add(1);

        maxpq.forEach((Integer val)-> System.out.println(val));

        while (!maxpq.isEmpty()) {
            int val = maxpq.poll();
        System.out.println("Removing elements.." + val);

        }
    }
    
}

    