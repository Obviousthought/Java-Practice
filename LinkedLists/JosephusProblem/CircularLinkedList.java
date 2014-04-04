public class CircularLinkedList {

	private Node head;
	private Node tail;
	private int length;

	// Method to append nodes to a circular linked list
	public void addNode(int data) {
		Node node = new Node(data);
		if (head == null) { 			// Assigns a head node
			head = node;
		} else {
			node.next = head; 			// Reference to head sets up node to be added as the new tail
			tail.next = node;
		}
		tail = node;
		length++;
	}

	// Method to display the list
	public void displayList() {
		if (length <= 1) {
			System.out.println(head.data);
		} else { 									// Code used to show full list and its connecting links
			Node temp = head;
			for (int i = 1; i <= length; i++) { 	// Used "for" loop b/c list size (length) is known
				System.out.print(temp.data);
				if (temp.next != head) {
					System.out.print("-->");
					temp = temp.next;
				}	
			}
		}
	}

	// Method to delete alternate nodes by removing the reference to them
	public void remAltNodes() {
		Node current = tail; 				// Start at tail to remove nodes in correct order
		while (current.next != current) {
			current = current.next.next;
			tail.next = current;
			tail = current;
			length--; 						// Decrement list size to ensure permanent removal
		}
		head = current;
	}
	
	// Create the Node inner class with a value (data) and a reference point (next)
	private static class Node {
		int data;
		Node next;

		// Constructor for creating a node with a set value (data)
		public Node(int data) {
			this.data = data;
		}
	}
}