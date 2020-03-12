package Execution;

import Definition.MyQueue;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.offer(i);
        }
        System.out.println("peek");
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println("offer--78");
        queue.offer(78);
        System.out.println(queue);
        System.out.println("Element");
        System.out.println(queue.element());
        System.out.println(queue);
        System.out.println("Poll");
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println("Remove");
        System.out.println(queue.remove());
        System.out.println(queue);
    }
}
