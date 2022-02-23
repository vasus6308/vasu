package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(12);
		queue.offer(24);
		queue.offer(45);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.peek());

	}

}
