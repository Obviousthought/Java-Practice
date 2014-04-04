public class Josephus {

	private CircularLinkedList circLL;
	private int numOfNodes;

	// Method to set the # of nodes to be added to a circular linked list
	public void setNumOfNodes(int x) {
		if (x == 0) {
			System.out.println("Provide a number with some substance, why don't ya?!");
		} else {
			numOfNodes = x;
		}
	}
	
	// Instantiate a circular linked list with nodes
	public void createCircularLinkedList() {
		circLL = new CircularLinkedList();
		for (int i = 1; i <= numOfNodes; i++) {
			circLL.addNode(i);
		}
	}
	
	// Call method to remove alternating nodes until 1 remains and prints it
	public void revealTheSurvivor() {
		circLL.remAltNodes();
		System.out.print("Survivor: ");
		circLL.displayList();
	}
	
	// Main method to run the program
	public static void main(String[] args) {
		Josephus joe = new Josephus();
		joe.setNumOfNodes(100);
		joe.createCircularLinkedList();
		joe.revealTheSurvivor();
	}
}
