package Queue;

import java.util.PriorityQueue;

public class PQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> minpq= new PriorityQueue<>();
        minpq.add(3);
        minpq.add(5);
        minpq.add(2);
        minpq.add(1);

        minpq.forEach((Integer val)-> System.out.println(val));

        while (!minpq.isEmpty()) {
            int val = minpq.poll();
        System.out.println("Removing elements.." + val);

        }
    }
    
}
