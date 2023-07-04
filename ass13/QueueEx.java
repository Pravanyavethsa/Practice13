package ass13;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList<>();
        queue.add(24);
        queue.add(44);
        queue.add(3);
        queue.add(49);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
    }
}
