package src.collections;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println("ArrayList: " + list);
        System.out.println("First element: " + list.get(0));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println("HashMap: " + map);
        System.out.println("Value for key 1: " + map.get(1));

        Set<String> set = new HashSet<>();
        set.add("Cat");
        set.add("Dog");
        set.add("Cat");
        System.out.println("HashSet: " + set);
        System.out.println("Contains 'Dog': " + set.contains("Dog"));

        Queue<String> queue = new ArrayDeque<>();
        queue.add("First");
        queue.add("Second");
        System.out.println("Queue: " + queue);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("After poll: " + queue);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(1);
        pq.add(3);
        System.out.println("PriorityQueue: " + pq);
        System.out.println("Poll from PriorityQueue: " + pq.poll());
        System.out.println("After poll: " + pq);
    }
}