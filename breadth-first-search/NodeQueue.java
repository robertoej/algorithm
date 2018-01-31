import java.util.Arrays;

public class NodeQueue {
	private Node[] queue;

	private int currentQueueSize;

	private int indexOfFirstElementInQueue;

	public NodeQueue(int initialSize) {
		queue = new Node[initialSize];
	}

	public void enqueue(Node element) {
		// Allocates more space when needed.
		if (currentQueueSize == queue.length) {
			queue = Arrays.copyOf(queue, queue.length * 2);
		}

		queue[currentQueueSize++] = element;
	}	

	public Node dequeue() {
		if (currentQueueSize == 0) {
			return null;
		} else {
			currentQueueSize--;

			Node dequeuedElement = queue[indexOfFirstElementInQueue++];

			if (currentQueueSize == 0) {
				indexOfFirstElementInQueue = 0;
			}

			return dequeuedElement;
		}
	}

	public int getSize() {
		return currentQueueSize;
	}

	public boolean isEmpty() {
		return currentQueueSize == 0;
	}
}