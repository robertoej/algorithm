public class BreadthFirstSearch {

	public void levelOrder(Node node) {
		NodeQueue nodeQueue = new NodeQueue(1);
		NodeQueue nodeQueueTemp = new NodeQueue(1);

		nodeQueue.enqueue(node);

		do {
			while (!nodeQueue.isEmpty()) {
				nodeQueueTemp.enqueue(nodeQueue.dequeue());
			}

			while (!nodeQueueTemp.isEmpty()) {
				Node temp = nodeQueueTemp.dequeue();

				System.out.println(temp.data);

				if (temp.left != null) {
					nodeQueue.enqueue(temp.left);
				}

				if (temp.right != null) {
					nodeQueue.enqueue(temp.right);
				}
			}
		} while (!nodeQueue.isEmpty());
	}
}